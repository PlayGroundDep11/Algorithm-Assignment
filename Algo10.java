import java.util.Scanner;

import javax.print.DocFlavor.CHAR_ARRAY;

public class Algo10 {
    private static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        String numberString ;
        do {
            System.out.print("Enter your number (+94XX XXXXXXX or 0XX-XXXXXXX) :" );
            numberString = scanner.nextLine() ;
        } while (numberString.strip().isBlank());
        char[] charArray = numberString.toCharArray();
        check :
        {
        if(numberString.strip().length()!=11 | numberString.strip().length() !=13) break check;
        if( charArray[charArray.length-8] != ' ' | charArray[charArray.length-8] != '-' ) break check;
        if( numberString.startsWith("0") | numberString.startsWith("+94") )// break check;



        for(int i = charArray.length-1  ; i >= 0 ; i--){
            if(i==charArray.length-8)  continue ;
            if(!Character.isDigit(charArray[i])){
                break check;
            } 
        }
        System.out.println("Number is validated");
        }

    }
}