import java.util.Scanner;

class Stack {
    int maxSize;
    int top;
    char[] stackArray;

    Stack(int size) {
        maxSize = size;
        top = -1;
        stackArray = new char[maxSize];
    }

    public void push(char item) {
        if (top >= maxSize - 1) {
            System.out.println("The stack is overflow");
        } else {
            stackArray[++top] = item;
            System.out.println("The item is pushed in stack: " + item);
        }
    }

    public char pop() {
        if (top == -1) {
            System.out.println("The stack is underflow");
            return '\0';
        } else {
            char val = stackArray[top];
            top--;
            return val;
        }
    }
}

public class Lab7B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        int len = str.length();
        Stack s1 = new Stack(len);

        // Push all characters of the string onto the stack
        for (int i = 0; i < len; i++) {
            s1.push(str.charAt(i));
        }

        int acount = 0;
        int bcount = 0;

        // Pop characters from the stack and count 'a's and 'b's
        for (int i = 0; i < len; i++) {
            char temp = s1.pop();
            if (temp == 'a') {
                acount++;
            } else if (temp == 'b') {
                bcount++;
            }
        }

        if (acount == bcount) {
            System.out.println("The string is proper");
        } else {
            System.out.println("The string is not proper");
        }
    }
}
