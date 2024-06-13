import java.util.Scanner;

public class Lab3A4 {
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
        int currentMin =arr[0];
        int currentMinIndex =0;
        int currentMax =arr[0];
        int currentMaxIndex =0;
        for(int i=0;i<arr.length;i++){
            // currentMin=arr[i];
            // currentMinIndex =i;
                if(arr[i]<currentMin){
                    currentMin=arr[i];
                    currentMinIndex=i;
                }
            
        }
        System.out.println("the min index is "+currentMinIndex);
        
        for(int i=0;i<arr.length;i++){
            
                if(arr[i]>currentMax){
                    currentMax=arr[i];
                    currentMaxIndex=i;
                }
            
        }
        System.out.println("the max index is "+currentMaxIndex);
        

    }
}
