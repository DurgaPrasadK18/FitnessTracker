package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "appointments")
public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	//Name
	@NotBlank
	@NotNull
	@Pattern(regexp ="^[a-zA-Z\s]+$")
	private String name;
	
	//Age
	@NotNull
	@NotBlank
	@Pattern(regexp = "[0-9 ]+")
	private String age;
	
	//Email
	@Email
	@NotNull
	@NotBlank
	@Size(max = 30)
	@Pattern(regexp = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])")
	private String email;
	
	//Mobile
	@NotNull
	@NotBlank
	@Pattern(regexp = "[0-9 ]+")
	@Size(max = 12)
	private String mobile;
	
	//Address Line 1 
	@NotNull
	@NotBlank
	@Size(max = 50)
	private String addressLine1;
	
	//Address Line 2
	@Size(max = 50)
	private String addressLine2;
	
	//City
	@NotBlank
	@NotNull
	@Size(max = 25)
	@Pattern(regexp ="^[a-zA-Z\s]+$")
	private String city;
	
	//State
	@NotBlank
	@NotNull
	@Size(max = 25)
	@Pattern(regexp ="^[a-zA-Z\s]+$")
	private String state;
	
	//Country
	@NotBlank
	@NotNull
	@Pattern(regexp ="^[a-zA-Z\s]+$")
	private String country;
	
	//ZIP/PIN
	@NotBlank
	@NotNull
	@Pattern(regexp = "[0-9 ]+")
	@Size(max = 7)
	private String pin;
	
	//Trainer Preference
	private String trainerPref;
	
	//Physio
	@Pattern(regexp = "^(?:Yes|No)$")
	private String physioReq;
	
	//Package
	@Pattern(regexp = "^(?:Basic|Premium)$")
	private String packageSel;
	
	//Weeks
	@Pattern(regexp = "[0-9 ]+")
	private String weeks;
	
	//Amount
	@Pattern(regexp = "[0-9 ]+")
	private String amount;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getTrainerPref() {
		return trainerPref;
	}

	public void setTrainerPref(String trainerPref) {
		this.trainerPref = trainerPref;
	}

	public String getPhysioReq() {
		return physioReq;
	}

	public void setPhysioReq(String physioReq) {
		this.physioReq = physioReq;
	}

	public String getPackageSel() {
		return packageSel;
	}

	public void setPackageSel(String packageSel) {
		this.packageSel = packageSel;
	}

	public String getWeeks() {
		return weeks;
	}

	public void setWeeks(String weeks) {
		this.weeks = weeks;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	
	

}
