package com.hbsoo.groovy

/**
 * Created by zun.wei on 2021/7/22.
 *
 */
class User {

    Long id
    String userName
    String password


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
