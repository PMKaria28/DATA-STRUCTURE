import java.util.Scanner;

public class Lab4A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] newArr = new int[n+1];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();

        }
        System.out.println("enter a position to insert an element");
        int p = sc.nextInt();

        for(int i=0;i<=n;i++){
            if(i<p){
                newArr[i]=arr[i];
            }else if(i==p){
                newArr[p]=sc.nextInt();
            }else if(i>p){
                newArr[i]=arr[i-1];
            }
        }
        for(int i=0;i<=n;i++){
            System.out.println("new array is "+newArr[i]);
        }

    }
}
