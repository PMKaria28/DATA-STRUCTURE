import java.util.Scanner;

public class Lab4A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] newArr = new int[n-1];
        int newIndex=0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();

        }
        System.out.println("enter a position to delete an element");
        int pos = sc.nextInt();
        // System.out.println("enter a value");
        // int num = sc.nextInt();

        for(int i=0;i<n;i++){
            if(i<pos){
                newArr[i]=arr[i];
            }else if(i==pos){
                continue;
            }else if(i>pos){
                newArr[i-1]=arr[i];
            }
            
        }
        for(int i=0;i<n-1;i++){
            System.out.println("the new array is"+newArr[i]);
        }
    }
}
