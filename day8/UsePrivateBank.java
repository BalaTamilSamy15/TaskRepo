package com.onesoft.day8;

public class UsePrivateBank {
	public static void main(String[] args) {
PrivateBank pb = new  PrivateBank();
pb.branchName="Citi Chennai";
pb.savingAmt=1219792;

pb.saAcc="SavAcc";
int savingAmt = pb.savingAmt();
System.out.println(savingAmt);
float rateOfIntrest = pb.rateOfIntrest();
System.out.println(rateOfIntrest);
System.out.println(" Branch Name "+pb.branchName+" Saving Bal  "+pb.savingAmt+" TypeOfAcc "+pb.saAcc);
}
}