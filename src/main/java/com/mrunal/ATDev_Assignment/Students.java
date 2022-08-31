package com.mrunal.ATDev_Assignment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students_data")
public class Students {

	@Id
	String s_rollno;

	String s_class;
	String s_firstname;
	String s_lastname;
	String s_contactno;

	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Students(String s_rollno, String s_class, String s_firstname, String s_lastname, String s_contactno) {
		super();
		this.s_rollno = s_rollno;
		this.s_class = s_class;
		this.s_firstname = s_firstname;
		this.s_lastname = s_lastname;
		this.s_contactno = s_contactno;
	}

	@Override
	public String toString() {
		return "Students [s_rollno=" + s_rollno + ", s_class=" + s_class + ", s_firstname=" + s_firstname
				+ ", s_lastname=" + s_lastname + ", s_contactno=" + s_contactno + "]";
	}

	public String getS_rollno() {
		return s_rollno;
	}

	public void setS_rollno(String s_rollno) {
		this.s_rollno = s_rollno;
	}

	public String getS_class() {
		return s_class;
	}

	public void setS_class(String s_class) {
		this.s_class = s_class;
	}

	public String getS_firstname() {
		return s_firstname;
	}

	public void setS_firstname(String s_firstname) {
		this.s_firstname = s_firstname;
	}

	public String getS_lastname() {
		return s_lastname;
	}

	public void setS_lastname(String s_lastname) {
		this.s_lastname = s_lastname;
	}

	public String getS_contactno() {
		return s_contactno;
	}

	public void setS_contactno(String s_contactno) {
		this.s_contactno = s_contactno;
	}

}
