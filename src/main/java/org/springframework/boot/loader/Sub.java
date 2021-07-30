package org.springframework.boot.loader;

public class Sub {
    public void s() {
        System.out.println("HGello!!");
        System.out.println(Sub.class.getClassLoader());
    }
}
