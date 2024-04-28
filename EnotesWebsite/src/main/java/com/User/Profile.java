package com.User;

import java.util.Date;

public class Profile {

	private int uId;
	private UserDetails uDetails;
	private String photo; 
	private String contact;
	private Date dob;
	private String gender;
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public UserDetails getuDetails() {
		return uDetails;
	}
	public void setuDetails(UserDetails uDetails) {
		this.uDetails = uDetails;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @param uId
	 * @param uDetails
	 * @param photo
	 * @param contact
	 * @param dob
	 * @param gender
	 */
	public Profile(int uId, UserDetails uDetails, String photo, String contact, Date dob, String gender) {
		super();
		this.uId = uId;
		this.uDetails = uDetails;
		this.photo = photo;
		this.contact = contact;
		this.dob = dob;
		this.gender = gender;
	}
	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}

}
