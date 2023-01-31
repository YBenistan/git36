package org.College;

public class Collegess implements College,Colleges{

	public void semester1() {
		System.out.println("Pass Precentace : 90%");
		
	}

	public void semester2() {
		System.out.println("Pass Precentage : 95%");
	}

	
	public void semester3() {
		System.out.println("Pass Precentage : 100%");
	}

	
	public void eceDept() {
		System.out.println("Total No Student : 1000");
	}

	public void cscDept() {
		System.out.println("Total No Student :1200");
	}

	public void itDept() {
		System.out.println("Total No Student : 1300");
		
	}
	public static void main(String[] args) {
		Collegess c = new Collegess();
		c.semester1();
		c.semester2();
		c.semester3();
		c.eceDept();
		c.cscDept();
		c.itDept();
	}

}
