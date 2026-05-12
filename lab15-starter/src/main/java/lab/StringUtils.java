package lab;

/**
 * Utility methods for String values.
 */
public final class StringUtils {

    private StringUtils() {
        // util class
    }

    /**
     * Returns true when input is null, empty, or whitespace only.
     */
    public static boolean isBlank(String s) {
        return s == null || s.trim().isEmpty();
    }

    /**
     * Capitalizes the first character and keeps the rest unchanged.
     */
    public static String capitalize(String s) {
        if (isBlank(s)) {
            return s;
        }
        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }

    /**
     * Reverses the given string. Returns null when input is null.
     */
    public static String reverse(String s) {
        if (s == null) {
            return null;
        }
        return new StringBuilder(s).reverse().toString();
    }
}