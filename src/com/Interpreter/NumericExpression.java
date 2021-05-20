package com.Interpreter;

public class NumericExpression implements Expression{

    private String Value;

    public NumericExpression(String token) {

        this.Value = token;

    }

    @Override
    public void interpret(Context context) {

        context.setOperator(context.getInteger(this.Value));
        context.calculate();
    }
}
