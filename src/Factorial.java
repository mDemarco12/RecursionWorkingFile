import java.util.Scanner;

public class Factorial {


    public static int fact(int num){
        if(num == 1){
            return 1;

        }else {

            return fact(num-1) * num;
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = scan.nextInt();

        System.out.println(x + "! = " + fact(x));

    }
}
