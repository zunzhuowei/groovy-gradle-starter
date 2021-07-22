package com.hbsoo.groovy

import com.hbsoo.java.IStarter01Java
import org.apache.commons.lang3.StringUtils

import static org.apache.commons.lang3.StringUtils.isNoneBlank

/**
 * Created by zun.wei on 2021/7/22.
 *
 */
class Starter01 implements IStarter01, IStarter01Java{



    @Override
    User getUserById(Long id) {
        def blank = isNoneBlank("")
        println blank

        def user = new User()
        user.password = '1111'
        user.id = id
        user.userName = "张三"
        user
    }

    @Override
    def getUser() {

        getUserById 110L
    }

    @Override
    User getUser2() {
        def user = getUser()
        user
    }

    @Override
    User getUserByIdInJava(Long id) {
        getUserById id
    }
}
