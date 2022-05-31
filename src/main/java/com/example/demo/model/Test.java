package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="detailstest")
public class Test {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String rbc;
	private String wbc;
	private String hemoglobin;
	private String mvc;
	private String mch;
	private String mchc;
	private String rdw;
	private String monocytes;
	private String basolhis;
	private String lybhocytes;
	@Override
	public String toString() {
		return "Test [id=" + id + ", rbc=" + rbc + ", wbc=" + wbc + ", hemoglobin=" + hemoglobin + ", mvc=" + mvc
				+ ", mch=" + mch + ", mchc=" + mchc + ", rdw=" + rdw + ", monocytes=" + monocytes + ", basolhis="
				+ basolhis + ", lybhocytes=" + lybhocytes + "]";
	}
	public Test(int id, String rbc, String wbc, String hemoglobin, String mvc, String mch, String mchc, String rdw,
			String monocytes, String basolhis, String lybhocytes) {
		super();
		this.id = id;
		this.rbc = rbc;
		this.wbc = wbc;
		this.hemoglobin = hemoglobin;
		this.mvc = mvc;
		this.mch = mch;
		this.mchc = mchc;
		this.rdw = rdw;
		this.monocytes = monocytes;
		this.basolhis = basolhis;
		this.lybhocytes = lybhocytes;
	}
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRbc() {
		return rbc;
	}
	public void setRbc(String rbc) {
		this.rbc = rbc;
	}
	public String getWbc() {
		return wbc;
	}
	public void setWbc(String wbc) {
		this.wbc = wbc;
	}
	public String getHemoglobin() {
		return hemoglobin;
	}
	public void setHemoglobin(String hemoglobin) {
		this.hemoglobin = hemoglobin;
	}
	public String getMvc() {
		return mvc;
	}
	public void setMvc(String mvc) {
		this.mvc = mvc;
	}
	public String getMch() {
		return mch;
	}
	public void setMch(String mch) {
		this.mch = mch;
	}
	public String getMchc() {
		return mchc;
	}
	public void setMchc(String mchc) {
		this.mchc = mchc;
	}
	public String getRdw() {
		return rdw;
	}
	public void setRdw(String rdw) {
		this.rdw = rdw;
	}
	public String getMonocytes() {
		return monocytes;
	}
	public void setMonocytes(String monocytes) {
		this.monocytes = monocytes;
	}
	public String getBasolhis() {
		return basolhis;
	}
	public void setBasolhis(String basolhis) {
		this.basolhis = basolhis;
	}
	public String getLybhocytes() {
		return lybhocytes;
	}
	public void setLybhocytes(String lybhocytes) {
		this.lybhocytes = lybhocytes;
	}

	

}
