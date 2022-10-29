public class Validation {
    public static String validOrDefault (String value, String defaultValue){
        return value == null || value.isBlank() ? defaultValue : value;
    }
}
