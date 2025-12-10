package lab;


class Student{
    private String name;  
    private Contact contact;


    public Student(String name, Contact contact){
        this.name = name;
        this.contact = contact;
    }
    public String getName(){
        return name;
    }
    public Contact getContact(){
        return contact;
    }
    
}
class Contact{
    private String mobile;
    private String email;
    public Contact(String mobile, String email){
      this.mobile = mobile;
      this.email = email;
    }
    public String toString(){
        return mobile + ","+ email;
    }
}

class School{
    private String schoolName;
    private Student[] students;
    private int count = 0;

    public School(String schoolName, int numofstudents){
        this.schoolName = schoolName;
        this.students = new Student[numofstudents];
    }
    public void addStudent( Student student){
        if(count < students.length){
        students[count] = student;
        count++;
        }
        else{
            System.out.println("can not add more students to" + schoolName);
        }
    }
    public void showStudents(){
        System.out.println("School:" + schoolName);
        System.out.println("Students:");
        for(int i = 0; i < count; i++){
        System.out.println("Name" + students[i].getName() + "contact:" + students[i].getContact() ); 
        }
    }
}

public class task1 {
    public static void main(String[] args){
 School school = new School("Riverdale", 3); 
 school.addStudent(new Student(" Mia ", new Contact("0170578891", "mia@mail.com"))); 
 school.addStudent(new Student(" Rose ", new Contact("0167890902", "rose@mail.com"))); 
 school.addStudent(new Student(" Gia ", new Contact("018989003", "gia@mail.com")));
 school.showStudents();
 }
 }


