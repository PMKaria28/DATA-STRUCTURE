import java.util.Scanner;

public class Lab3B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.println("the value is "+arr[i]);
        }

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("the index of first element is"+i+"and second element is "+j);
                }
            }
        }
    }
}
