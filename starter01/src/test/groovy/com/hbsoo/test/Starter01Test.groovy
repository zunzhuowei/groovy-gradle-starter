package com.hbsoo.test

import com.hbsoo.groovy.IStarter01
import com.hbsoo.groovy.Starter01
import com.hbsoo.groovy.User
import org.junit.Test

/**
 * Created by zun.wei on 2021/7/22.
 *
 */
class Starter01Test {


    @Test
    void test() {
        IStarter01 starter01 = new Starter01()
        def user = starter01.getUserById 1
        println user
    }


    @Test
    void test2() {
        IStarter01 starter01 = new Starter01()
        def user = starter01.getUserByIdInJava 10000
        println user
    }


    @Test
    void test03() {
        IStarter01 starter01 = new Starter01()
        def user2 = starter01.getUser2()
        println " ----------- " + user2
    }

}
