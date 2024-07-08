import java.util.Scanner;
class stack1{
    int Maxsize;
    int top;
    int[] stackArray;
    stack1(int size){
        Maxsize=size;
        top=-1;
        stackArray=new int[Maxsize];
   }
   public void push(int item){
        if(top>=Maxsize-1){
            System.out.println("the stack is overflow");
        }else{
            stackArray[++top]=item;
        System.out.println("the item is pushed in stack "+item);
        }
    
    }
    public int pop(){
        if(top==-1){
            System.out.println("the stack is underflow");
            return -1;
        }else{
            int val = stackArray[top];
            top--;
            // System.out.println("the item is popped "+val);
            return val;
        }
        
    }
}
public class Lab7A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String str = sc.nextLine();
        if(str.length() % 2==0){
            System.out.println("invalid string");
            return;
        }
        stack1 s1 = new stack1(str.length()/2 +1);
        //s1.pop();
        for(int i=0;i<str.length()/2;i++){
            s1.push(str.charAt(i));
        }
        int start = str.length()/2 + 1;
        for(int i=start;i<str.length();i++){
            if(s1.pop()!=str.charAt(i)){
               System.out.println("invalid string ");
               return;
            }
        }

        System.out.println("valid string");
    }
}
