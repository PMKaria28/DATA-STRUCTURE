import java.util.Scanner;
import java.util.Stack;
class Stack1{
    int Maxsize;
    int top;
    int[] stackArray;
    Stack1(int size){
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
    public void pop(){
        if(top==-1){
            System.out.println("the stack is underflow");
        }else{
            int val = stackArray[top];
            top--;
            System.out.println("the item is popped "+val);
        }
        
    }
    public void peep(int i){
        if(top-i+1<0){
            System.out.println("stack is underflow");
        }else{
            System.out.println("the top element is "+stackArray[top-i+1]);
        }
        
    }
    public void display(){
        System.out.println("the elments of stack are as follows ");
        for(int i=top;i>=0;i--){
            System.out.println("the elements are "+stackArray[i]);
        }
    }
    public void change(int pos,int item){
        stackArray[pos-1]=item;
        System.out.println("the changed element is "+item);
    }
}
public class Lab7A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of stack");
        int n= sc.nextInt();
        Stack1 stack = new Stack1(n);
        int choice;
        do{
            System.out.println("enter 1 to insert an element\n enter 2 to dekete element\nenter 3 to peep\nenter 4 to display\nenter 5 to change");
             choice =sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter element to push");
                    int el=sc.nextInt();
                    stack.push(el);
                    break;
                case 2:
                   stack.pop();
                break;
                case 3:
                System.out.println("enter pos from top to peep");
                int el1=sc.nextInt();
                stack.peep(el1);
                break;
                case 4:
                stack.display();
                break;
                case 5:
                System.out.println("enter val to change ");
                int val=sc.nextInt();
                System.out.println("enter pos to change ");
                int cha=sc.nextInt();
                stack.change(cha,val);
                break;
                default:
                    break;
            }
        }while(choice !=-1);

    }
}
