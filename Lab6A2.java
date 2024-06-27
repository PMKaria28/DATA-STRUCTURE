import java.util.Scanner;
class Employee_detail{
    int Employee_id;
    String name;
    String designation;
    double salary;
    Scanner scc = new Scanner(System.in);
    Scanner sc = new Scanner(System.in);
    public void scan(){
        System.out.println("enter the employee id");
        Employee_id = sc.nextInt();
        System.out.println("enter the employee name");
        name = scc.nextLine();
        System.out.println("enter the employee designation");
        designation = scc.nextLine();
        System.out.println("enter the salary");
        salary = sc.nextDouble();
    }
    public void display(){
        System.out.println("The employee id is "+Employee_id);
        System.out.println("The employee name is "+name);
        System.out.println("The employee designation is "+designation);
        System.out.println("The salary is "+salary);
    }
}


public class Lab6A2 {
    public static void main(String[] args) {
        
        Employee_detail E1 = new Employee_detail();
        E1.scan();
        E1.display();
    }
}