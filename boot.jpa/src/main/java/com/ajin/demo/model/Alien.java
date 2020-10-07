package com.ajin.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien {

	@Id
	@Column
	private int aId;
	@Column
	private String aName;

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public String getaName() {
		return aName;
	}

	public void setaName(String aName) {
		this.aName = aName;
	}
	System.out.println("hello");

	@Override
	public String toString() {
		return "Alien [aId=" + aId + ", aName=" + aName + "]";
	}

}
