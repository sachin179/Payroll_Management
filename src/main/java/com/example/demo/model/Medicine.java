package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Patient")
public class Medicine {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String username;
	private String Lastname;
	private String phone;
	private String email;
	private String nic;
	private String bgroup;
	private String dname;
	@Override
	public String toString() {
		return "Medicine [id=" + id + ", username=" + username + ", Lastname=" + Lastname + ", phone=" + phone
				+ ", email" + email + ", nic=" + nic + ", bgroup=" + bgroup + ", dname=" + dname + "]";
	}
	public Medicine(int id, String username, String Lastname, String phone, String nic, String bgroup, String dname) {
		super();
		this.id = id;
		this.username = username;
		this.Lastname = Lastname;
		this.phone = phone;
		this.phone = email;
		this.nic = nic;
		this.phone = phone;
		this.bgroup = bgroup;
		this.dname = dname;
		
	}
	public Medicine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getNic() {
		return nic;
	}
	public void setNic(String nic) {
		this.nic = nic;
	}
	public String getBgroup() {
		return bgroup;
	}
	public void setBgroup(String bgroup) {
		this.bgroup = bgroup;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}


	
	
}
