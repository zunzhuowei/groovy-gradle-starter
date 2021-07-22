package com.hbsoo.groovy

import com.hbsoo.java.IStarter01Java
import groovy.transform.PackageScope

/**
 * Created by zun.wei on 2021/7/22.
 *
 */
class Starter02 implements IStarter01Java, IStarter02Java {


    @Override
    User getUserByIdInJava(Long id) {
        IStarter01 starter01 = new Starter01()
        starter01.getUserById id
    }

    @Override
    Player getPlayerById(Long id) {
        closure.call(id, "李四")
    }


    @PackageScope
    def closure = { long id, String name ->
        def player = new Player()
        player.id = id
        player.name = name
        player.ph = 100L
        player

    }

}
