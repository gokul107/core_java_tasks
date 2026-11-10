package Nine_oct;

public class String_functions_prog {
    public static void main(String[] args) {
        String str = "Hello Java";
        String str2 = "hello java";

        System.out.println("1. Length: " + str.length());
        System.out.println("2. Character: " + str.charAt(0));
        System.out.println("3. Uppercase: " + str.toUpperCase());
        System.out.println("4. Lowercase: " + str.toLowerCase());
        System.out.println("5. Equals: " + str.equals(str2));
        System.out.println("6. Equals Ignore Case: "
                + str.equalsIgnoreCase(str2));
        System.out.println("7. Substring: " + str.substring(6));
        System.out.println("8. Contains: " + str.contains("Java"));
        System.out.println("9. Replace: " + str.replace("Java", "World"));
        System.out.println("10. Trim: " + "  Hello  ".trim());
        System.out.println("11. Starts With: " + str.startsWith("Hello"));
        System.out.println("12. Ends With: " + str.endsWith("Java"));
    }

}
