import java.util.Scanner;

public class Overview {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = 5;
        System.err.println("enter a number");
        int b = sc.nextInt();
        System.out.println(a);
        System.err.println(b);
        sc.nextLine();

        System.out.println("enter your name");
        String name = sc.nextLine();
        System.out.println(name);

        float num = sc.nextFloat();
        System.out.println("number is "+num);
        

    }
}
