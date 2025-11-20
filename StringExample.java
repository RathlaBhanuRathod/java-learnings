/*
String class and methods
    The String class in Java is a part of the java.lang package and represents a sequence of characters. 
    Strings are immutable in Java, meaning once a String object is created, it cannot be changed. 
    The String class provides a wide range of methods for manipulating and handling strings.

Strings can be created in several ways:
    String literals:
    String str1 = "Hello, World!";
    Using the new keyword:
    String str2 = new String("Hello, World!");

Here are some of the most commonly used methods in the String class:
    Length:
        The length() method is used to determine the number of characters (including spaces) in a string. It returns the length of the string as an integer:
        int length()
        Returns the number of characters in the string:
                int len = str1.length();
                Character access:


        char charAt(int index)
        Returns the character at the specified index:

            char ch = str1.charAt(0);  // 'H'
        
        Substring:
        String substring(int beginIndex)
        Returns a new string that is a substring starting from the specified index to the end of the string:

            String substring(int beginIndex, int endIndex)
            Returns a new string that is a substring from the specified beginIndex to endIndex – 1:

            String sub1 = str1.substring(7);        // "World!"
            String sub2 = str1.substring(7, 12);    // "World"
        
        Concatenation:
            String concat(String str)
            Concatenates the specified string to the end of this string:

            String str3 = str1.concat(" How are you?"); // "Hello, World! How are you?"

        Contains:
            boolean contains(CharSequence s)
            Returns true if the string contains the specified sequence of characters:

            boolean containsWorld = str1.contains("World");  // true

        Index of:
            int indexOf(int ch)
            Returns the index of the first occurrence of the specified character:

            int indexOf(String str)
            Returns the index of the first occurrence of the specified substring:

            int index = str1.indexOf('W');       // 7
            int index2 = str1.indexOf("World");  // 7
        Replace:
            String replace(char oldChar, char newChar)
            Replaces all occurrences of the specified character with the new character:

            String replace(CharSequence target, CharSequence replacement)
            Replaces each substring that matches the specified literal target sequence with the specified literal replacement sequence:

            String str4 = str1.replace('o', '0');          // "Hell0, W0rld!"
            String str5 = str1.replace("World", "Java");  // "Hello, Java!"
        Trim:
            String trim()
            Returns a copy of the string with leading and trailing whitespace removed:

            String str6 = "  Hello, World!  ";
            String trimmed = str6.trim();  // "Hello, World!"

        To lower case / to upper case:
            String toLowerCase()
            Converts all characters in the string to lower case:

            String toUpperCase()
            Converts all characters in the string to upper case:

            String lower = str1.toLowerCase();  // "hello, world!"
            String upper = str1.toUpperCase();  // "HELLO, WORLD!"
        Split:
            String[] split(String regex)
            Splits the string around matches of the given regular expression.

            String[] words = str1.split(", ");  // ["Hello", "World!"]
        Value of:
            static String valueOf(int i)
            Returns the string representation of the specified primitive type:
            String numberStr = String.valueOf(123);  // "123"



 */

public class StringExample {
    public static void main(String[] args) {
    String greeting = "Hello, World!";
    // Length
    System.out.println("Length: " + greeting.length());
    // Character at
    System.out.println("Character at index 1: " + greeting.charAt(1));
    // Substring
    System.out.println("Substring from index 7: " + greeting.substring(7));
    System.out.println("Substring from index 7 to 12: " + greeting.substring(7, 12));

    // Concatenation
    String extendedGreeting = greeting.concat(" How are you?");
    System.out.println("Concatenated String: " + extendedGreeting);

    // Contains
    System.out.println("Contains 'World': " + greeting.contains("World"));

    // Index of
    System.out.println("Index of 'W': " + greeting.indexOf('W'));

    // Replace
    System.out.println("Replace 'World' with 'Java': " + greeting.replace("World", "Java"));

    // Trim
    String withSpaces = "  Hello, World!  ";
    System.out.println("Trimmed String: '" + withSpaces.trim() + "'");

    // To Lower Case / To Upper Case
    System.out.println("Lower Case: " + greeting.toLowerCase());
    System.out.println("Upper Case: " + greeting.toUpperCase());

    // Split
    String[] parts = greeting.split(", ");
    System.out.println("Split parts: " + parts[0] + " and " + parts[1]);
}
}
