package com.day4;

public class President extends Employee1{
 public long Km;
 public double TourAllowance;
 public static long  TravelAllowance=2000;
public President() {
	super();
	// TODO Auto-generated constructor stub
}
public President(int empId, String empName, double basicSalary, double medical) {
	super(empId, empName, basicSalary, medical);
	// TODO Auto-generated constructor stub
}
 @Override
 public double calculateNetSal() {
	 TourAllowance=Km*8;
	 double Salary =super.calculateNetSal();
	 double PresidentSal=Salary+TourAllowance+TravelAllowance;
	 System.out.println("PresidentSalary:"+PresidentSal);

	return PresidentSal;
}
}
