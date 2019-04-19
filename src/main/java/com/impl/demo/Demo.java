package com.impl.demo;

import static spark.Spark.get;

/**
 * @Author admin
 * @Date 2019-04-19 12:26
 **/
public class Demo {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
    }
}
