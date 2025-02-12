public class Demo083 {
    public static void main(String[] args) {
        
        String str = "Apple";

       
        checkFirstCharacter(str);
    }

   
    public static void checkFirstCharacter(String str) {

        if (str == null || str.isEmpty()) {
            System.out.println("The string is empty.");
            return;
        }

        char firstChar = Character.toLowerCase(str.charAt(0));

      
        if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u') {
            System.out.println("The first character is a vowel.");
        } else if (Character.isLetter(firstChar)) {
            System.out.println("The first character is a consonant.");
        } else {
            System.out.println("The first character is not a letter.");
        }
    }
}
