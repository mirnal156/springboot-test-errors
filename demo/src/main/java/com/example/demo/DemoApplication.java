package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);

    // ❌ Error 1: System.err
    System.err.println("This is an error");

    // ❌ Error 2: Unused variable
    int x = 10;

    // ❌ Error 3: Duplicate string
    String a = "hello";
    String b = "hello";

    // ❌ Error 4: Empty catch
    try {
        int y = 10 / 0;
    } catch (Exception e) {
    }
}

}
