public class StringWildcardMatch {
    public static void main(String[] args) {
        String string1 = "hello";
        String string2 = "h?llo*";

        boolean isMatch = matchStrings(string1, string2);

        System.out.println("Strings match: " + isMatch);
    }

    public static boolean matchStrings(String string1, String string2) {
        // Escape special characters in string2
        String escapedString2 = escapeSpecialCharacters(string2);

        // Replace '?' wildcard character with '.' and '*' wildcard character with '.*'
        // in escapedString2
        String regex = escapedString2.replace("?", ".").replace("*", ".*");

        // Use the matches() method to check if string1 matches the modified regular
        // expression
        return string1.matches(regex);
    }

    public static String escapeSpecialCharacters(String str) {
        // Escape special characters in a string using backslashes
        return str.replace("\\", "\\\\")
                .replace(".", "\\.")
                .replace("^", "\\^")
                .replace("$", "\\$")
                .replace("|", "\\|")
                .replace("(", "\\(")
                .replace(")", "\\)")
                .replace("[", "\\[")
                .replace("]", "\\]")
                .replace("{", "\\{")
                .replace("}", "\\}")
                .replace("+", "\\+")
                .replace("?", "\\?")
                .replace("*", "\\*");
    }
}
