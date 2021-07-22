package com.hbsoo.groovy

/**
 * Created by zun.wei on 2021/7/22.
 *
 */
class Player {

    long id
    String name
    long ph
    List<String> cards


    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ph=" + ph +
                ", cards=" + cards +
                '}';
    }
}
