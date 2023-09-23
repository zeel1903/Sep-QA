package sep23;
import java.util.Scanner;

public class iternary {
    public static void main (String[]args){
        Scanner scanner =  new Scanner (System .in);
        System.out.println("Enter number");
        int number = scanner .nextInt();
        System.out.println(number <0 ? "negative": "positive");

    }
}
