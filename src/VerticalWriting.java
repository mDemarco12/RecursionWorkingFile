import java.util.Scanner;

public class VerticalWriting {


    public static void verticalWriting(int num) {

        if (num < 10) {
            System.out.println(num);

        }else{
            //Will print backward
            System.out.println(num%10);
            verticalWriting(num/10);

            //Will print foward
            //verticalWriting(num/10);
            //System.out.println(num%10);

            //5986%10 = 6;
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any integer: ");
        int x = scan.nextInt();

        verticalWriting(x);


    }
}