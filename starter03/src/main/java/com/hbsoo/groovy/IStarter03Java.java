package com.hbsoo.groovy;

import java.util.Arrays;

/**
 * Created by zun.wei on 2021/7/22.
 */
public interface IStarter03Java {


    String readFileFromClasspath(String fileName);

    default void test() {
        final String s = Arrays.asList("1", "2").stream()
                .reduce((s1, s2) -> s1 + s2).get();
        System.out.println(s);
    }

}
