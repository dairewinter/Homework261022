public class Validation {
    public static String validOrDefault(String value, String defaultValue) {
        return value == null || value.isBlank() ? defaultValue : value;
    }

    public static boolean isLogPassValid(String s) {
        String allowedSymbols = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz0123456789_";
        if (s.length() > 20) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!allowedSymbols.contains(String.valueOf(s.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}