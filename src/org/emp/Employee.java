package org.emp;

public class Employee {
	private void empId() {
		System.out.println("Employee ID 56582");

	}
 private void empId(String name) {
	 System.out.println("Employee Name:"+name);
}
 private void empId(int age) {
	 System.out.println("Employee Age:"+age);
 }
 private void empId(int pin, float height) {
	 System.out.println("Employee Pin:"+pin+"\n"+"Employee height:"+height);
}
 private void empId(float weight) {
	 System.out.println("Employee weight:"+weight);	
}
 
 
 
 
 
//<<<<<<< HEAD
 private void m2() {
	System.out.println("ashmita");}
//=======
 private void m1() {
System.out.println("ragavi");
//>>>>>>> 4847d0c3fd18121de107b08ba7107b9859122d42

}
 public static void main(String[] args) {
	Employee e = new Employee();
	e.empId();
	e.empId("Ragavi");
	e.empId(24);
	e.empId(620002, 5.2f);
	e.empId(63f);
}
	

}
