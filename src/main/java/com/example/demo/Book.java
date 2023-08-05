package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String degree;
	private String spl;
	private String exp;
	private String address;
	private String phone;
	@Column(length=1000000)
	private byte[] image;
	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int id, String name, String degree, String spl, String exp, String address, String phone,
			byte[] image) {
		super();
		this.id = id;
		this.name = name;
		this.degree = degree;
		this.spl = spl;
		this.exp = exp;
		this.address = address;
		this.phone = phone;
		this.image = image;
	}
	public Book(String name, String degree, String spl, String exp, String address, String phone,
			byte[] image) {
		super();
		this.name = name;
		this.degree = degree;
		this.spl = spl;
		this.exp = exp;
		this.address = address;
		this.phone = phone;
		this.image = image;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getSpl() {
		return spl;
	}
	public void setSpl(String spl) {
		this.spl = spl;
	}
	public String getExp() {
		return exp;
	}
	public void setExp(String exp) {
		this.exp = exp;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	
	
	
	
	
}
