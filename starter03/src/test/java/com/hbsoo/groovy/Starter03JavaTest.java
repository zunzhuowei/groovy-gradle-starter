package com.hbsoo.groovy;

import org.junit.Test;

/**
 * Created by zun.wei on 2021/7/22.
 */
public class Starter03JavaTest {


    @Test
    public void test() {
        IStarter03Java starter03Java = new Starter03();
        starter03Java.test();
        final String s = starter03Java.readFileFromClasspath("test.txt");
        System.out.println("s = " + s);
    }

}
