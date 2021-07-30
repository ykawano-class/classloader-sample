package com.example.dummy;

import com.example.interfaces.I;

public class Impl implements I {
    @Override
    public void hello() {
        System.out.println("Helllllo!!");
        System.out.println(Impl.class.getClassLoader());
        System.out.println(I.class.getClassLoader());
    }
}
