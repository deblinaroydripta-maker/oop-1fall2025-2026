


abstract class Employee{

protected String name;
Employee(String name) {
this.name = name;
}
         

abstract void calculateSalary();
void showDetails(){
System.out.println("Employee name :" + name);
}
}

class FullTimeEmployee extends Employee{
double hourlypay;
double hours;
        
FullTimeEmployee(double hourlypay, double hours, String name){

super(name);
this.hourlypay = hourlypay;
this.hours = hours;
}

@Override
void calculateSalary(){
double salary = hourlypay * hours;
System.out.println("Salary:" + salary);
}
}        


public class problem2 {
public static void main(String[] args) {
Employee em = new FullTimeEmployee(500, 70, "dia");
em.calculateSalary();
em.showDetails();
 }   
}
