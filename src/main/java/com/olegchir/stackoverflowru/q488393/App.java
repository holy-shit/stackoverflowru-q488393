package com.olegchir.stackoverflowru.q488393;

import org.apache.commons.beanutils.BeanUtils;

/**
 * Created by olegchir on 02/02/16.
 */
public class App {
    public static void main(String[] args) {

        B b = new B();
        b.setX("123");

        A a = new A();

        try {
            BeanUtils.copyProperties(a, b);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(a.getX());
    }
}
