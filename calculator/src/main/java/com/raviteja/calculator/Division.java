package com.raviteja.calculator;

public class Division {
	
	float first_operand;
	float second_operand;
	
	Division(float first_operand, float second_operand){
		this.first_operand  = first_operand;
		this.second_operand = second_operand;
	}
	
	public float divideTwoNumbers() {
		return this.first_operand / this.second_operand;
	}

}
