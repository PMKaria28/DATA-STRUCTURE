import java.util.Scanner;

public class Lab4A3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n= sc.nextInt();
        int[] arr = new int[n];
        int[] newArr = new int[n+1];
        boolean flag=true;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        // System.out.println("enter a position to insert");
        // int pos = sc.nextInt();
        System.out.println("enter a number to insert");
        int num = sc.nextInt();

        for(int i=0;i<n;i++){
            if(arr[i]<num){
                newArr[i]=arr[i];
            }else if(arr[i]>=num){
                if(flag){
                    newArr[i]=num;
                    flag=false;
                    newArr[i+1]=arr[i];
                }else{
                    newArr[i+1]=arr[i];
                }
                
            }
        }
        for(int i=0;i<n+1;i++){
            System.out.println("the new array "+newArr[i]);
        }
    }
}
