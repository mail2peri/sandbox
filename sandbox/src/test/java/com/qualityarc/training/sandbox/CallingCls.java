package com.qualityarc.training.sandbox;

public class CallingCls extends checkReturnStmt {

	public static void main(String[] args) {
		getName();
		System.out.println(name.toUpperCase());
		checkReturnStmt obj = new checkReturnStmt();
		System.out.println(obj.name);
		

	}

}
