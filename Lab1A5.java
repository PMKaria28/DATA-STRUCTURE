import java.util.*;
public class Lab1A5{
    public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the number");
     int n=sc.nextInt();
     int ans=product(n);
     System.out.println(ans);
    }
    public static int product(int n){
        if(n==1){
            return 1;
        }
        return n*product(n-1);
        
    }

}