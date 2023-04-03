import java.util.Scanner;

public class Multiplication {

    public static int multiply(int x, int y) {
        if( y ==0 ){
            return 0;
        }else if( y == 1){

            return x;
        }else{

            return multiply(x,(--y)) + x;
        }

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scan.nextInt();

        System.out.println(num1 + " x " + num2 + " = " + multiply(num1,num2));
    }
}
