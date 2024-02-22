public class Assign3Q1 { 
    public static void main(String args[]){
        char someChar= 'a';
         
         switch (someChar){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': 

           System.out.println("Char is vowel " + someChar);
           break;
           default:
           System.out.println("This is not in the English Alphabet");
               break;

         }
    }
}
   