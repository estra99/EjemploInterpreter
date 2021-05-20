package com.Interpreter;

public class OperationExpression implements Expression {

    private String Operation;


    public OperationExpression(String token) {

        this.Operation = token;

    }

    @Override
    public void interpret(Context context) {

        context.setOperation(this.Operation);
    }
}
