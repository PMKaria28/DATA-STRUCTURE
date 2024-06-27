import java.util.Scanner;

public class Lab6A1{
    public static int num1 , num2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
         num1 = sc.nextInt();
        System.out.println("enter another number");
        num2 = sc.nextInt();
        swap();
        System.out.println(num1);
        System.out.println(num2);
    }
    public static void swap() {
        int temp;
        temp = num1;
        num1 = num2;
        num2=temp;
    }   
}