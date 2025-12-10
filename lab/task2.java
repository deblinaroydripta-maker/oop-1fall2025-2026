package lab;

class Employee{
    private String name;  
    private Position position;


    public Employee(String name, Position position){
        this.name = name;
        this.position = position;
    }
    public String getName(){
        return name;
    }
    public Position getPosition(){
        return position;
    }
    
}
class Position{
    private String title;
    private double salary;
    public Position(String title, double salary){
      this.title = title;
      this.salary = salary;
    }
    public String toString(){
        return title + ","+ salary;
    }
}

class Company{
    private String companyName;
    private Employee[] employees;
    private int count = 0;

    public Company(String companyName, int numofemplyees){
        this.companyName = companyName;
        this.employees = new Employee[numofemplyees];
    }
    public void addEmployee( Employee employee){
        if(count < employees.length){
        employees[count] = employee;
        count++;
        }
        else{
            System.out.println("can not add more employees to" + companyName);
        }
    }
    public void showEmployees(){
        System.out.println("Company:" + companyName);
        System.out.println("Employees:");
        for(int i = 0; i < count; i++){
        System.out.println("Name" + employees[i].getName() + "Position:" + employees[i].getPosition() ); 
        }
    }
}


public class task2 {
    public static void main(String[] args) {
        Company company = new Company("Dreams", 3);

        company.addEmployee(new Employee(" Mia ", new Position("Manager", 100000)));

        company.addEmployee(new Employee(" Deep ", new Position("Engineer", 900000)));

        company.addEmployee(new Employee(" Roy ", new Position("Designer", 800000)));

        company.showEmployees();
    }

}
