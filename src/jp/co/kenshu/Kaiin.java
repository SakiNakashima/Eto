package jp.co.kenshu;

import java.util.Date;

public class Kaiin {
	private int id;
	private String name;
	private Date addDate;
	Kaiin(){};

	Date date = new Date();

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

	public Date getDate() {
		return addDate;
	}

	public void setDate(Date addDate) {
		this.addDate = addDate;
	}
}