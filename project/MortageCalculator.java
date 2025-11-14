package project;

import java.util.Scanner;

public class MortageCalculator {
    
public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  double salary = 0;
  double creditscore = 0;
  boolean criminalrecord = false;

  System.out.println("enter salary");
   while (true) { 
       if(input.hasNextDouble()){
      salary = input.nextDouble();
        break; 
       }
       else{
        System.out.println("Invalid input! Please enter a numeric value");
        input.next();
       }
   }


System.out.println("Enter credit score between 0 to 500");
while (true) { 
    if(input.hasNextDouble()){
     creditscore = input.nextDouble();
     if(creditscore >= 0 && creditscore <= 500){
        break;
     }
     else{
        System.out.println("Credit score must be between 0 and 500");
     } 
  }
  else{
    System.out.println("Invalid input! Please enter a numeric value");
    input.next();
  }
}

System.out.println("do you have a criminal record(true/false"); 
while (true) { 
    if(input.hasNextBoolean()){
      criminalrecord = input.nextBoolean();
      break;
    }
    else{
        System.out.println("Invalid input! Please enter true or false");
        input.next();
    }
}

 

boolean eligible = (creditscore >= 300) && !criminalrecord;

if (!eligible){ 
  System.out.println("You are not eligible");
  System.out.println("Reason: You must have a good credit score (≥ 300) and no criminal record");
  input.close();
  return;
}

System.out.println("Enter your  loan amount:");
double principal = input.nextDouble();

if (principal > 2 * salary){
  System.out.println("loan request denied");
  System.out.println("reason: loan amount must be under 2 times your salary.");
  input.close();
  return;
}

double rate,year;

System.out.println("enter interest rate:");
rate = input.nextDouble();

System.out.println("enter time:");
year = input.nextDouble();

double monthlyrate = (rate/100) / 12 ;
double months = year * 12 ;

double monthlypayment = principal * (monthlyrate * Math.pow(1 + monthlyrate, months)) / (Math.pow(1 + monthlyrate, months)-1);
double total = monthlypayment * months;
double trate = total - principal;

 System.out.println("loan amount:"  + principal);
 System.out.println("monthly payment: " + months);
 System.out.println("total payment: " + total);
 System.out.println("total interest: " + trate);
 input.close();

 }

}
