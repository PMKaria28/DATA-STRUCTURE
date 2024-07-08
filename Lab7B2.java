import java.util.Scanner;

class MyCharStack {
    private char[] stack;
    private int top;

    public MyCharStack(int size) {
        stack = new char[size];
        top = -1;
    }

    public void push(char c) {
        if (top < stack.length - 1) {
            stack[++top] = c;
        }
    }

    public char pop() {
        if (top >= 0) {
            return stack[top--];
        }
        return '\0';  // Return null character if stack is empty
    }

    public char peek() {
        if (top >= 0) {
            return stack[top];
        }
        return '\0';  // Return null character if stack is empty
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

public class Lab7B2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of test cases: ");
        int len = sc.nextInt();
        
        String[] str = new String[len];
        int[] ans = new int[len];

        for (int i = 0; i < str.length; i++) {
            System.out.print("Enter " + i + "th String: ");
            str[i] = sc.next();
        }

        for (int i = 0; i < str.length; i++) {
            if (isValid(str[i])) {
                ans[i] = 1;
            } else {
                ans[i] = 0;
            }
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.println("ans[" + i + "] = " + ans[i]);
        }
        
        sc.close();
    }

    private static boolean isValid(String s) {
        MyCharStack ms1 = new MyCharStack(s.length());
        
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current == '(' || current == '{' || current == '[') {
                ms1.push(current);
            } else {
                if (ms1.isEmpty()) {
                    return false;
                }
                char top = ms1.peek();
                if ((current == ')' && top == '(') ||
                    (current == '}' && top == '{') ||
                    (current == ']' && top == '[')) {
                    ms1.pop();
                } else {
                    return false;
                }
            }
        }

        return ms1.isEmpty();
    }
}
