package com.day4;

public class Employee1 {
	
public  int empId;
	public String empName;
	public double BasicSalary;
	public double medical;
	public  double HRA;
	public double PF;
	public static int PT=200;
	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee1(int empId, String empName, double basicSalary, double medical) {
		super();
		this.empId = empId;
		this.empName = empName;
		BasicSalary = basicSalary;
		this.medical = medical;
		
	}
	 public  double calculateNetSal() {
		 HRA=0.5*BasicSalary;
		 PF=0.12*BasicSalary;
		 medical=0.12*BasicSalary;
		 double GrossSalary= HRA+ BasicSalary+ medical;
		 double NetSal=GrossSalary -(PF+PT);
		return NetSal;
		 
	 }
	
     public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getBasicSalary() {
		return BasicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		BasicSalary = basicSalary;
	}
	public double getMedical() {
		return medical;
	}
	public void setMedical(double medical) {
		this.medical = medical;
	}
	public double getHRA() {
		return HRA;
	}
	public void setHRA(double hRA) {
		HRA = hRA;
	}
	public double getPF() {
		return PF;
	}
	public void setPF(double pF) {
		PF = pF;
	}
	public static int getPT() {
		return PT;
	}
	public static void setPT(int pT) {
		PT = pT;
	}
	public void displayEmployeeInfo(int empId, String empName, double NetSalary) {
    	 System.out.println("employeeid:\" +employeeid+  \"employeename:\" +employeename+ \"NetSalary:\" +NetSalary");
     }
	

}
