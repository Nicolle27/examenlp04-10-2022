package com.example.examen.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@AllArgsConstructor 
@NoArgsConstructor
public class Fecha implements Serializable{
	private static final long serialVersionUID = 1L;
	private int OrderID;
	private String OrderDate;
	public int getOrderID() {
		return OrderID;
	}
	public void setOrderID(int orderID) {
		OrderID = orderID;
	}
	public String getBirthDate() {
		return OrderDate;
	}
	public void setBirthDate(String birthDate) {
		OrderDate = birthDate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
