package com.jobs.domain;

public class Volunteer extends AbsStaffMember {

	public Volunteer(String name, String address, String phone) throws Exception {
		super(name, address, phone);
		
	}
	
	//Complete Volunteer pay Volunteer 0
	@Override
	public void pay() {
		totalPaid = 0;
	}

	//Print data
	@Override
	public String toString() {
		return "Volunteer [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + ", totalPaid=" + totalPaid + "]";
	}
	
}
