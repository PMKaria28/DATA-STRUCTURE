import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Lab5B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scc = new Scanner(System.in);
        System.out.println("Enter the number of words ");
        int n = sc.nextInt();
        int randomNo = (int)Math.floor(Math.random()*n);
        System.out.println("the Random number is "+randomNo);

        String[] arr1 = new String[n];
        for(int i=0;i<n;i++){
            arr1[i] = scc.nextLine();
        }
        for(int i=0;i<n;i++){
            System.out.println("the words are "+arr1[i]);
        }


        System.out.println("the word to be displayed "+arr1[randomNo]);
        System.out.println("enter the word for anagram");
        String anagramWord = scc.next();
        char[] anagramWord1 = new char[anagramWord.length()];
        char[] randomNo1 = new char[arr1[randomNo].length()];

        Arrays.sort(anagramWord1);
        Arrays.sort(randomNo1);
        boolean flag=false;
        for(int i=0;i<anagramWord.length();i++){
            for(int j=0;j<arr1[randomNo].length();j++){
                if(anagramWord1[i]!=randomNo1[j]){
                    System.out.println("the word is not an anagram");
                    return;
                }else{
                    flag = true;
                }
            }
        }
        if(flag){
            System.out.println("the word is an anagram");
        }

    }
}
