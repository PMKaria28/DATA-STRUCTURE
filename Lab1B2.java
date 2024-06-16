import java.util.Scanner;

public class Lab1B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to get factors");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i+" is a factor of "+n);
            }
        }

    }
}
