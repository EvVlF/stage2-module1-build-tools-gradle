package com.epam.utils;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @ParameterizedTest(name = "{0}")
    @ValueSource(strings = {"16", "65.01", "151/2486", "1.101/9.901", "+16", "+65.01", "+151/2486", "+1.101/9.901"})
    void isPositiveNumber(String str) {
        assertTrue(StringUtils.isPositiveNumber(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "0", "000.00", "-1165", "-112.01", "-64/647", "-1.101/9.901"})
    @NullAndEmptySource
    void skipNonPositiveNumber(String str){
        assertFalse(StringUtils.isPositiveNumber(str));
    }
}