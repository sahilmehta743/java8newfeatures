package com.example.practice.TestSameDefaultMethodInTwoInterface;

public class TestDifferentInterfaceHavingSameMethod implements Left, Right {

    @Override
    public void m1() {
    Right.super.m1();
    }

    public static void main(String[] args) {
        TestDifferentInterfaceHavingSameMethod sameMethod = new TestDifferentInterfaceHavingSameMethod();
        sameMethod.m1();
    }
}
