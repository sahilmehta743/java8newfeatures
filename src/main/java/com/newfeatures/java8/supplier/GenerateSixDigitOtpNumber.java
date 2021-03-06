package com.newfeatures.java8.supplier;

import java.util.function.Supplier;

public class GenerateSixDigitOtpNumber {
    public static void main(String[] args) {
        Supplier<String> otps = () -> {
            String otp = "";
            for (int i = 0; i < 6; i++) {
                otp = otp + (int) (Math.random() * 10);
            }
            return otp;
        };

        System.out.println(otps.get());
    }
}