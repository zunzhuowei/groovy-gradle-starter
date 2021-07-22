package com.hbsoo.groovy

import groovy.json.internal.Charsets
import org.apache.commons.io.IOUtils
import org.codehaus.groovy.tools.groovydoc.ClasspathResourceManager

import java.util.function.BinaryOperator

/**
 * Created by zun.wei on 2021/7/22.
 *
 */
class Starter03 implements IStarter02Java, IStarter03Java {


    @Override
    Player getPlayerById(Long id) {
        { it ->
            def player = new Player()
            player.id = it
            player.name = "start03"
            player.ph = 120L
            player
        }.call(id)
    }

    @Override
    String readFileFromClasspath(String fileName) {
        ClasspathResourceManager manager = new ClasspathResourceManager()
        def inputStream = manager.getInputStream fileName
        def listOfStrings = IOUtils.readLines(inputStream, Charsets.UTF_8)
        def string = listOfStrings.stream().reduce(new BinaryOperator<String>() {
            @Override
            String apply(String s, String s2) {
                s + s2
                //return new String(s.getBytes(), Charset.forName("UTF-8")) \
                //+  new String(s2.getBytes(), Charset.forName("UTF-8"))
            }
        }).get()

        inputStream.close()
        string
    }


}
