package com.yeonfish.voteservice.util;

public class UUID {
    public static String generate() {
        String uuid = java.util.UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
        return uuid;
    }
}
