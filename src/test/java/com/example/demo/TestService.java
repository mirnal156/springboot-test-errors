package com.example.Services; // ❌ Wrong package name

public class TestService {

    public void test() {

        // ❌ Hardcoded password
        String password = "123456";

        // ❌ System.out instead of logger
        System.out.println("Testing");

        // ❌ Empty catch
        try {
            int a = 10 / 0;
        } catch (Exception e) {
        }
    }
}