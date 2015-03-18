package com.Beans;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

public class LoanService implements JavaDelegate {
	@Override
	public void execute(DelegateExecution arg0) throws Exception {
		// TODO Auto-generated method stub
		LoanApplicant loan = new LoanApplicant();
		loan.setName((String) arg0.getVariable("name"));
		loan.setLoanAmount((Long) arg0.getVariable("amount"));
		loan.setIncome((Long) arg0.getVariable("salary"));
		arg0.setVariable("loanapplicant", loan);
	}
}
