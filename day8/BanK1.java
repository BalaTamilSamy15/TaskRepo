package com.onesoft.day8;

public class BanK1 {
int loanAmt=50000;
public int  findLoan(String name) {
	return loanAmt;
}
public int findLoan(String name,int salary) {
	return loanAmt+salary;
}
public int findLoan(int salary,int noOfProp) {
	return (loanAmt+salary)*noOfProp;

}
}
