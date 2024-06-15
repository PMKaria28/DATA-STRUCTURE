import java.util.Scanner;

public class Lab1A4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number ");
        int n = sc.nextInt();
        int sum=1;
        for(int i =n;i>=1;i--){
            sum=sum*i;
        }
        System.out.println("the answer of factorial is "+sum);
    }
}
