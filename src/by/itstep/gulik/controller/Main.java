package by.itstep.gulik.controller;

import by.itstep.gulik.model.entity.A;
import by.itstep.gulik.model.entity.B;
import by.itstep.gulik.model.logic.ExSystem;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        ExSystem.run(b);
    }
}
