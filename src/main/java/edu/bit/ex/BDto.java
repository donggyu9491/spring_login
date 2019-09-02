package edu.bit.ex;

public class BDto {
	private int empno;
	private String ename;
	
	public int getEmpno() {
		return empno;
	}
	
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	
	public String getEname() {
		return ename;
	}
	
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public BDto(int empno, String ename) {
		this.empno = empno;
		this.ename = ename;
	}
	
	public BDto() {
		
	}

}
