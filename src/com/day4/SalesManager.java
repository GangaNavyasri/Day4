package com.day4;

public class SalesManager extends Employee1{
	private double  PetrolAllowance;
	private double FoodAllowance;
	private double OtherAllowance;
	public SalesManager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SalesManager(int empId, String empName, double basicSalary, double medical) {
		super(empId, empName, basicSalary, medical);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double calculateNetSal() {
		 double Salary = super.calculateNetSal();
		PetrolAllowance=0.8*BasicSalary;
		FoodAllowance=0.13*BasicSalary;
		OtherAllowance=0.3*BasicSalary;
		 
		 double SaleManager=Salary+PetrolAllowance+FoodAllowance+OtherAllowance;

		return SaleManager;
		
		
	}

}
