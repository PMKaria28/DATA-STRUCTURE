import java.util.Scanner;

public class Lab1B1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int x = sc.nextInt();
        System.out.println("eneter a power");
        int y= sc.nextInt();
        int sum=1;
        for(int i=1;i<=y;i++){
            sum = sum * x;
        }
        System.out.println("the value is"+sum);


    }
}