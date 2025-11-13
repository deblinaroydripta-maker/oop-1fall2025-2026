package project;

import java.util.Scanner;

public class MortageCalculator{
public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

double salary = getValidDouble(input, "enter your salary : ");  
double creditscore = getValidCreditScore(input);

boolean criminalrecord = getValidBoolean(input, "do you have a criminal record(true/false) : "); 

boolean eligible = (creditscore >= 300) && !criminalrecord;

if (!eligible){ 
  System.out.println("You are not eligible");
  System.out.println("Reason: You must have a good credit score (≥ 300) and no criminal record");
  input.close();
  return;
}

double principal = getValidDouble(input, "Enter your  loan amount: ");

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

private static double getValidDouble(Scanner input, String message) {
 while (true) {
 System.out.print(message);
 if (input.hasNextDouble()){
  return input.nextDouble();
 }
  else{
    System.out.println("invalid input");
    input.next();
  }
 }
}    
private static double getValidCreditScore(Scanner input) {
while (true) {
 System.out.print("enter your credit score (0-500): ");
  if (input.hasNextDouble()){
    double score = input.nextDouble();
    if (score >= 0 && score <= 500)
    return score;
    else
    System.out.println("credit score must be between 0 to 500");
  }
  else {     
    System.out.println("invalid,enter between 0 to 500");
    input.next();
  }     
 }
}

private static boolean getValidBoolean(Scanner input, String message){
while (true) { 
    System.out.println(message);
    if (input.hasNextBoolean()){
  return input.nextBoolean();
 }
  else{
    System.out.println("invalid input try true or false");
    input.next();
   }
  }
 }
}