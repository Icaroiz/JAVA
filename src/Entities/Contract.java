package Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {

	private Integer number;
	private Date date;
	private Double TotalValue;
	
	List<Installment>installments = new ArrayList<Installment> ();
	
	public Contract() {
		
	}
	
	public Contract(Integer number, Date date, Double totalValue) {
		this.number = number;
		this.date = date;
		TotalValue = totalValue;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return TotalValue;
	}

	public void setTotalValue(Double totalValue) {
		TotalValue = totalValue;
	}

	public List<Installment> getInstallments() {
		return installments;
	}


	
	
	
	
	
}
