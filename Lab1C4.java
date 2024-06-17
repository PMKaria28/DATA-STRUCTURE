import java.util.Scanner;

public class Lab1C4 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number ");
    int n = sc.nextInt();
    sc.close();
    int a=0;
    int b=0;
    int t=0;
    t=n;
    while(n>0){
      a=n%10;
      b=b+a*a*a;
      n=n/10;

    }
    if(b==t){
      System.out.println("the number is armstrong");
    }else{
      System.out.println("not a armstrong number");
    }
    
   } 
}
