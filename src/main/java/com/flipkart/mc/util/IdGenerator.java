package com.flipkart.mc.util;

import java.util.UUID;

public class IdGenerator {
    public static String generateId() {
        UUID id = UUID.randomUUID();
        return id.toString();
    }
}
