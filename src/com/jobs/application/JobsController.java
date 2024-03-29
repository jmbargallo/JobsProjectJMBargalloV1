package com.jobs.application;

import com.jobs.domain.AbsStaffMember;
import com.jobs.domain.Employee;
import com.jobs.domain.Volunteer;
import com.jobs.persistence.EmployeeRepository;

public class JobsController {

	private EmployeeRepository repository;
	
	public JobsController(){
		repository = new EmployeeRepository();
	}
	
	public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee boss = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateBoss());
		repository.addMember(boss);
	}
	
	public void createEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee employee = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateEmployee());
		repository.addMember(employee);
	}
	//New code from here

	//Create Manager

	public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		Employee manager = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateManager());
		repository.addMember(manager);
	}

	//Complete method pay
	public void payAllEmployeers() {
		for (AbsStaffMember member: repository.getAllMembers()) {
			member.pay();
		}
	}
	//Complete method
	public String getAllEmployees() {
		String allEmployees = "";
		for (AbsStaffMember member: repository.getAllMembers()) {
			allEmployees = allEmployees + "\n" + member.toString();
		}
		return allEmployees;
	}
	//Complete method
	public void createVolunteer(String string, String string2, String string3) throws Exception{
		Volunteer volunteer = new Volunteer(string, string2, string3);
		repository.addMember(volunteer);
	}
	
	
	
}
