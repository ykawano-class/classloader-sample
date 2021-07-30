package com.example.dummy;

import org.springframework.boot.loader.I;
import org.springframework.boot.loader.Sub;

public class Impl implements I {
    @Override
    public void hello() {
        System.out.println("Helllllo!!");
        System.out.println(Impl.class.getClassLoader());
        System.out.println(I.class.getClassLoader());

    }
}
