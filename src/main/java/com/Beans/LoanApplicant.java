package com.Beans;

import java.io.Serializable;

public class LoanApplicant implements Serializable {
	private static final long serialVersionUID = 1L;
	private long income;

	public long getIncome() {
		return income;
	}

	public void setIncome(long income) {
		this.income = income;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private long loanAmount;

	public long getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(long loanAmount) {
		this.loanAmount = loanAmount;
	}

	private boolean checkCreditOk;

	public boolean isCheckCreditOk() {
		return checkCreditOk;
	}

	public void setCheckCreditOk(boolean checkCreditOk) {
		this.checkCreditOk = checkCreditOk;
	}

	@Override
	public String toString() {
		return " LoanApplicant [income=" + income + ", name=" + name
				+ ", loanAmount=" + loanAmount + ", checkCreditOk="
				+ checkCreditOk + "]";
	}
}
