package com.Testing_Java.JavaTest.util;

import static org.junit.Assert.*;

public class StringUtilTest {
    public static void main(String[] args) {
        assertEquals(StringUtil.repeat("hola", 3), "holaholahola");
        assertEquals(StringUtil.repeat("hola", 1), "hola");
    }
}