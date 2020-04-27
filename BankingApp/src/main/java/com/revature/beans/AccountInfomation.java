package com.revature.beans;

public class AccountInfomation {
	private int ID;
	private double OpenDate;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public double getOpenDate() {
		return OpenDate;
	}
	public void setOpenDate(double openDate) {
		OpenDate = openDate;
	}
	@Override
	public String toString() {
		return "AccountInfomation [ID=" + ID + ", OpenDate=" + OpenDate + "]";
	}
	
}
