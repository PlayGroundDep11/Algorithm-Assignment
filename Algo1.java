import java.util.Scanner;

public class Algo1{
    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        int number ;
        while(true){
            System.out.print("Enter a positive number :");
            number = scanner.nextInt() ;
            scanner.nextLine() ;
            if(number>0) break ;    
        }
        int count1 = 1 ;
        int count2 = 0 ;
        int result = 0;
        System.out.print(0+",");

        do {
            count2 = result ;
            result += count1 ;
            count1 = count2 ;
            if(result>number) break ;
            System.out.print(result+",");

        } while(true);
        System.out.print("\b");
    }
}