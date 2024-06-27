import java.util.Scanner;

public class Lab6B1 {
    static double temperature;
    public static  double convertToCelsius(double temperature) {
        return (temperature - 32) * 5/9; 
    }
    public static double  convertToFahrenhit(double temperature) {
        return (temperature * 9/5) + 32; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         temperature = sc.nextInt();
        System.out.println("enter 1 to convert to celsius enter 2 to convert to farenheit ");
        int input = sc.nextInt();
        if (input==1) {
            double celsius = convertToCelsius( temperature);
            System.out.println(celsius);
        }else{
            double farenheit1 = convertToCelsius( temperature);
            System.out.println(farenheit1);
        }


    }
}