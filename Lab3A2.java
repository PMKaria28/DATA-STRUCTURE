import java.util.Scanner;

public class Lab3A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int m = sc.nextInt();
        System.out.println("enter another number");
        int n =sc.nextInt();

        int sum =0;

        for(int i=m;i<=n;i++){
            sum = sum +i;

        }
        System.out.println("the total sum is"+sum);
    }
}
