public class Assign3Q1 { 
    public static void main(String args[]){
        char someChar= 'a';
         
        switch (someChar){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': 
            
            System.out.println("Char is: " + someChar);
            System.out.println("someChar " + someChar + " is a vowel.");
            break;
        default:
            if ((someChar >= 'a' && someChar <= 'z') || (someChar >= 'A' && someChar <= 'Z'))
                System.out.println("The character " + someChar + " is a consonant.");
            else
                System.out.println("The character " + someChar + " is not in the English alphabet.");
            break;
         }
    }
}
  