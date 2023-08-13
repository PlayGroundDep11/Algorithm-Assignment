import java.util.Scanner;

import javax.print.DocFlavor.CHAR_ARRAY;

public class Algo10 {
    private static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        String numberString ;
        do {
            System.out.print("Enter your number (+94 XX XXXXXXX or 0XX-XXXXXXX) :" );
            numberString = scanner.nextLine() ;
            if(numberString.strip().isBlank()) System.out.println("Telephone number can't be empty");
        } while (numberString.strip().isBlank());
        char[] charArray = numberString.toCharArray();

        if (numberString.length() == 11) {
            if(numberString.startsWith("0") && numberString.charAt(3)==' '){
                System.out.println("Number is validated");
            }
        }else if( numberString.length() == 14){
            if( numberString.startsWith ("+94") && numberString.charAt(3)==' ' && numberString.charAt(6)==' ' ){
                System.out.println("Number is validated");
            }

        }
        else System.out.println("Invalid phone number");

    }
}