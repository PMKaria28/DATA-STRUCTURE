import java.util.Scanner;

public class Lab1C3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("enter the value");
        int n = sc.nextInt();
        int totalsum=0;
        for(int i=1;i<=n;i++){
            totalsum+=(i*(i+1))/2;
        }
        System.out.println("the sum is"+totalsum);
    }
}
