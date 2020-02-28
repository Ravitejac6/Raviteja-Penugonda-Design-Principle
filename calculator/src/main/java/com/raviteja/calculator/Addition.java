package com.raviteja.calculator;

public class Addition {
	
	float first_operand;
	float second_operand;
	
	Addition(float first_operand, float second_operand){
		this.first_operand  = first_operand;
		this.second_operand = second_operand;
	}
	
	public float addTwoNumbers() {
		return this.first_operand + this.second_operand;
	}
}
