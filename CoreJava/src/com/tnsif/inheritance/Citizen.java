package com.tnsif.inheritance;

public class Citizen {
	private String name;
	private long adhaarno;
	private String address;
	private long phno;
	public Citizen(String name,long adhaarno,String address,long phno) {
		super();
		this.name=name;
		this.adhaarno=adhaarno;
		this.address=address;
		this.phno=phno;
	}
	public Citizen() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAdhaarno() {
		return adhaarno;
	}
	public void setAdhaarno(long adhaarno) {
		this.adhaarno = adhaarno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", adhaarno=" + adhaarno + ", address=" + address + ", phno=" + phno + "]";
	}
	

}
