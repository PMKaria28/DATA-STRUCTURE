import java.util.Scanner;
class Student_detail{
    int enrollment_no;
    String name;
    int semester;
    double cpi;
    Scanner scc = new Scanner(System.in);
    Scanner sc = new Scanner(System.in);
    public void scan(){
        System.out.println("enter the Enrollment number");
        enrollment_no = sc.nextInt();
        System.out.println("enter the  name");
        name = scc.nextLine();
        System.out.println("enter the Semester");
        semester = sc.nextInt();
        System.out.println("enter the cpi");
        cpi = sc.nextDouble();
    }
    public void display(){
        System.out.println("The employee id is "+enrollment_no);
        System.out.println("The employee name is "+name);
        System.out.println("The employee designation is "+semester);
        System.out.println("The salary is "+cpi);
    }
}

public class Lab6A3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of students");
        int n=sc.nextInt();
        Student_detail []S = new Student_detail[n];
        for(int i=0;i<n;i++){
            S[i] = new Student_detail();
            S[i].scan();

        }
        System.out.println("PRINTING DETAILS");
        for(int i=0;i<n;i++){
            S[i].display();
            System.out.println();
        }
    }
}