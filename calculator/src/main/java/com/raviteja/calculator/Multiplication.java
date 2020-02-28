package com.raviteja.calculator;

public class Multiplication {
	
	float first_operand;
	float second_operand;
	
	Multiplication(float first_operand, float second_operand){
		this.first_operand  = first_operand;
		this.second_operand = second_operand;
	}
	
	public float multiplyTwoNumbers() {
		return this.first_operand * this.second_operand;
	}

}
