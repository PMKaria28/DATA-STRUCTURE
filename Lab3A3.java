import java.util.Scanner;

public class Lab3A3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n= sc.nextInt();
        int sum =0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        int avg = sum/n;
        System.out.println("the average is "+avg);
    }
}
