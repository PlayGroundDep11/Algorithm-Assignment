import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Algo5 {
    private static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        String text ;
        do{
            System.out.print("Enter a text :");
            text = scanner.nextLine() ;
            
        }while(text.strip().isBlank()) ;
        char[] textChar = text.toCharArray() ;
        String temp = "" ;
        for(int i = textChar.length - 1 ; i >= 0 ; i-- ){
            temp+=textChar[i];
        }
        System.out.println(temp);
    }
}
