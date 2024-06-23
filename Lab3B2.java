import java.util.Scanner;

public class Lab3B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
       

        int[] arr = new int[n];


        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println("the arrays are "+arr[i]);
        }
        System.out.println("Enter the first number to replace");
        int x = sc.nextInt();
        System.out.println("Enter another number to put in an array");
        int y=sc.nextInt();

        for(int i=0;i<n;i++){
            if(arr[i]==x){
                arr[i]=y;
                System.out.println("the index of first number is "+i);
            }
        }
        for(int i=0;i<n;i++){
            System.out.println("the final array is "+arr[i]);
        }
    }
}
