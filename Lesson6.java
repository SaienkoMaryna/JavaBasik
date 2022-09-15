import java.util.Random;
import java.util.Scanner;

class Lesson6 {
    public static void main (String[] args) {
       
       Random random = new Random();
       for(int i = 0; i <50 ; i++) {
       System.out.print(random.nextInt(10)+ " ");
       System.out.println("Hello, word");
       System.out.println(Math.sqrt(16));//kvadratniy koren, imyaklass.imya metoda
}
       Scanner scanner = new Scanner(System.in);
            System.out.println("\n napishi chislo ");
            int a = scanner.nextInt();
            System.out.println(a * 2);
        
        Random random1 = new Random();
        Scanner scanner1 = new Scanner(System.in);
        int number = random1.nextInt(10);
        int quess = -1;
        
        for (int i = 0; i < 3 ; i++) {
            System.out.print(" guess the number [0..9]");
            int guess = scanner1.nextInt();       
        if (quess < number) {
            System.out.println(" your number is less ");
        } else if (quess > number) {
            System.out.println("your number is bigger");
        } else {
            System.out.println("you quess");
            break;
        }
        }
    }  
    }
   