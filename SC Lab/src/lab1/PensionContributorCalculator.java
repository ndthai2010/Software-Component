package src.lab1;

import java.util.Scanner;

public class PensionContributorCalculator {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SALARY_CEILING = 6000;
		final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
		final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
		final double EMPLOYEE_RATE_55_TO_60 = 0.13;
		final double EMPLOYER_RATE_55_TO_60 = 0.13;
		final double EMPLOYEE_RATE_60_TO_65 = 0.075;
		final double EMPLOYER_RATE_60_TO_65 = 0.09;
		final double EMPLOYEE_RATE_65_ABOVE = 0.05;
		final double EMPLOYER_RATE_65_ABOVE = 0.075;
		
		int salary, age;
		int contributableSalary;
		double employeeContribution, employerContribution, totalContribution;
		
		System.out.print("Enter the monthly salary: ");
		salary = sc.nextInt();
		System.out.print("Enter the age: ");
		age = sc.nextInt();
		sc.close();
		
		if(salary > SALARY_CEILING) {
			contributableSalary = SALARY_CEILING;
		}else {
			contributableSalary = salary;
		
		if(age <= 55) {
			employeeContribution = salary * EMPLOYEE_RATE_55_AND_BELOW;
		 	employerContribution = salary * EMPLOYER_RATE_55_AND_BELOW;
		 	totalContribution = employeeContribution + employerContribution;
		} else if (age <= 60) {
			employeeContribution = salary * EMPLOYEE_RATE_55_TO_60;
			employerContribution = salary * EMPLOYER_RATE_55_TO_60;
			totalContribution = employeeContribution + employerContribution;
		} else if (age <= 65) {
			employeeContribution = salary * EMPLOYEE_RATE_60_TO_65;
			employerContribution = salary * EMPLOYER_RATE_60_TO_65;
			totalContribution = employeeContribution + employerContribution;
		} else {
			employeeContribution = salary * EMPLOYEE_RATE_65_ABOVE;
			employerContribution = salary * EMPLOYER_RATE_65_ABOVE;
			totalContribution = employeeContribution + employerContribution;
		}
		
		System.out.printf("The employee's contribution is: %.2f%n", employeeContribution);
		System.out.printf("The employer's contribution is: %.2f%n", employerContribution);
		System.out.printf("The total contribution is: %.2f%n", totalContribution);
		}
	}
}
