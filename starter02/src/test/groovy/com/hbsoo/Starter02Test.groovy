package com.hbsoo

import com.hbsoo.groovy.IStarter02Java
import com.hbsoo.groovy.Player
import com.hbsoo.groovy.Starter02
import com.hbsoo.groovy.User
import org.junit.Test

/**
 * Created by zun.wei on 2021/7/22.
 *
 */
class Starter02Test {

    @Test
    void test() {
        IStarter02Java starter02Java = new Starter02()
        def user = starter02Java.getUserByIdInJava 222
        println user
        def player = starter02Java.getPlayerById(333)
        println player
    }

}
