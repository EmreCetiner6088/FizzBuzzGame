import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputnumber = scanner.nextInt();
        for(int i = 0 ; i <= inputnumber ; i++) {

           if (i % 15 == 0) {
               System.out.print(i);
               System.out.println(" : FizzBuzz");
           } else if (i % 5 == 0) {
               System.out.print(i);
               System.out.println(" : Buzz");
           } else if (i % 3 == 0) {
               System.out.print(i);
               System.out.println(" : Fizz");
           }else {
               System.out.println(i);

           }
            System.out.println();
        }
    }
}