public class ProgramFour {
    public static void main(String[] args) {
        String originalString = "Hello World";
  
        // 1. Substring
        String subString = originalString.substring(6); // Get substring from index 6 to end
        System.out.println("Substring: " + subString);
        
        // 2. toLowerCase
        String lowerCaseString = originalString.toLowerCase(); // Convert to lowercase
        System.out.println("Lowercase: " + lowerCaseString);
        
        // 3. toUpperCase
        String upperCaseString = originalString.toUpperCase(); // Convert to uppercase
        System.out.println("Uppercase: " + upperCaseString);
        
        // 4. Concatenation
        String concatenatedString = originalString.concat(" Java"); // Concatenate with " Java"
        System.out.println("Concatenated: " + concatenatedString);
        
        // 5. Replace
        String replacedString = originalString.replace('o', '0'); // Replace 'o' with '0'
        System.out.println("Replaced: " + replacedString);
        
        // 6. Trim
        String stringWithWhitespace = "   Trim me   ";
        String trimmedString = stringWithWhitespace.trim(); // Trim leading and trailing whitespace
        System.out.println("Trimmed: " + trimmedString);
    }
}
