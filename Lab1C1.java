import java.util.Scanner;

public class Lab1C1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter seconds you want to conver");
        int x = sc.nextInt();
        int hours=0;
        int minutes=0;    
        int seconds=0;

        hours=x/3600;
        x=x%3600;
        minutes=x/60;
        
        seconds=x%60;
        System.out.println("hh "+hours+"mm "+minutes+"ss "+seconds);    

    }
}
