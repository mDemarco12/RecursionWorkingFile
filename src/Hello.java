import java.util.Scanner;

public class Hello {

    public static void printSomething(String str, int n) {

        if(n<0){
            System.out.println(str);
                                //n-- will result in an infinite loop, use n-1 or --n;
                                //--n will subtract before, n-- will subtract after initial n
            printSomething(str,(n-1));
        }
    }
    public static void hello(int n ){
        if(n>0){
            System.out.println("Hello");
            hello(n-1);
        }

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String value");
        String s = scan.nextLine();
        System.out.println();

    }

}
