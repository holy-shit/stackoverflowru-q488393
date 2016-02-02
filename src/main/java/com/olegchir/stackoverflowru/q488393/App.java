package com.olegchir.stackoverflowru.q488393;

import org.apache.commons.beanutils.BeanUtils;

/**
 * Created by olegchir on 02/02/16.
 */
public class App {
    public static void main(String[] args) {

        //Готовим исходные данные
        B b = new B();
        b.setX("123");
        A a = new A();

        //Копируем поля между классами
        try {
            BeanUtils.copyProperties(a, b);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Вот эта строчка должна вывести только плохое
        test(b);

        //А вот это уже хорошее!
        test(a);

    }

    public static void test(A a) {
        if (a.getClass().equals(A.class)) {
            System.out.println(String.format("Все просто замечательно, и значение = %s", a.getX()));
        } else {
            System.out.println("Ты пытаешься выполнить меня с неверным классом!");
        }
    }
}
