import java.util.Scanner;

public class Lab1A1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle ");
        int r = sc.nextInt();
        double area = Math.PI *r*r;
        System.out.println("the area is "+area);
    }
}