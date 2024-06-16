import java.util.Scanner;

public class Lab1C2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of days ");
        int days=sc.nextInt();
        int year=0,week=0;

        year= days/365;
        days=days%365;
        week=days/7;
        days=days%7;
        System.out.println(year+" years "+week+" week "+days+" days ");
    }
}
