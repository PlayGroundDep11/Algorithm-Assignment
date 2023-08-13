import java.util.Scanner;

public class Algo7 {
    private static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        String userText ;
        do {
            System.out.print("Enter your text :");
            userText = scanner.nextLine() ;
        } while (userText.strip().isBlank());
        int countLetters = 0 ;
        int max = 0 ;
        int min = userText.length() ;
        String word = "";
        String maxWordString ="";
        String minWordString ="";
        char[] charArray = (userText+" ").toCharArray() ;
        for(int i =0 ; i < charArray.length ; i++){
            if(charArray[i]==' '){
                if(max<countLetters){
                    max = countLetters ;
                    maxWordString = word ;
                }
                if(min>=countLetters){
                    min = countLetters ;
                    minWordString = word ;
                }
                countLetters = 0 ;
                word = "" ;
                continue ;
            }
            countLetters++ ;
            word += charArray[i]  ;
        }

        System.out.printf("Maximum length word is : %s, length = %s \n",maxWordString,maxWordString.length());
        System.out.printf("Minimum length word is : %s, length = %s \n",minWordString,minWordString.length());
    }
}
