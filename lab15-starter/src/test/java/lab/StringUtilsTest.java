package lab;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class StringUtilsTest {

    @Test
    @DisplayName("reverse: empty string")
    void reverse_emptyString() {
        assertEquals("", StringUtils.reverse(""));
    }

    @Test
    @DisplayName("reverse: single character")
    void reverse_singleCharacter() {
        assertEquals("x", StringUtils.reverse("x"));
    }

    @Test
    @DisplayName("reverse: ASCII text")
    void reverse_asciiText() {
        assertEquals("dcba", StringUtils.reverse("abcd"));
    }

    @Test
    @DisplayName("reverse: Unicode text")
    void reverse_unicodeText() {
        assertEquals("\u0430\u0440\u044D\u0421", StringUtils.reverse("\u0421\u044D\u0440\u0430"));
    }

    @Test
    @DisplayName("reverse: null returns null")
    void reverse_null() {
        assertNull(StringUtils.reverse(null));
    }
}