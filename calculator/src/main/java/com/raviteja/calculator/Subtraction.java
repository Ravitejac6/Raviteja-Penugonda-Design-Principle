package com.raviteja.calculator;

public class Subtraction {
	
	float first_operand;
	float second_operand;
	
	Subtraction(float first_operand, float second_operand){
		this.first_operand  = first_operand;
		this.second_operand = second_operand;
	}
	
	public float subtractTwoNumbers() {
		return this.first_operand - this.second_operand;
	}

}
