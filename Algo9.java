import java.util.Scanner;

public class Algo9 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String userInput ="" ;
        do {
            System.out.print("Enter a single word :");
            userInput = scanner.nextLine() ;
            if(userInput.strip().indexOf(' ')<0) break ;
        } while (true );
        char[] charVariable = userInput.toCharArray(); 
        int k = 0 ;
        for(int i = userInput.length() - 1 ; i > 0 ; i-- ){
            if(i<=k){
                System.out.println("\033[34mYou entered a palindrome\033[33");
                break ;
            }
            if(userInput.charAt(k)!=userInput.charAt(i)){
                System.out.println("\033[31mNot a palindrome !!\033[0m");
                break ;} ;
            k++ ;
        }
    }
}
