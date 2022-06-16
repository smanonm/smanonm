package day2.assign2;

public class EmpDetails {
	public static void main(String[] args) {
		EmpDetails obj4= new EmpDetails();
		String empName = null;
		int empId = 0;
		obj4.printEmployeeName(empName, empId);
	String empAddress = null;
	String empAddress1 = obj4.getEmployeeAddress(empAddress);
	System.out.println(empAddress1);
	double empSalary = 0;
	    obj4.printEmployeeSalary(empSalary);
	long mobNum1 = (long) 0;
	    obj4.printEmployeeMobileNumber(mobNum1);
	}
	
public void printEmployeeName(String empName, int empId) {
	String empName1 = empName;
	empName1 = "MANO";
	System.out.println(empName1);
	int empId1 = empId;
	empId1 = 1234;
	System.out.println(empId1);	
}
private String getEmployeeAddress(String empAddress) {
	 String empAddress1 = empAddress;
	    empAddress1 = "CHENNAI";
		return empAddress1;
}
public void printEmployeeSalary(double empSalary) {
	double empSalary1 = empSalary;
	empSalary1 = 15000.00;
	System.out.println(empSalary1);
}
public Long printEmployeeMobileNumber(long mobNum) {
    Long mobNum1 = mobNum;
    mobNum1 = 8729808078L;
	System.out.println(mobNum1);
	return mobNum1;
}
}