package com.Interpreter;

// Context permite gestionar las entradas y salidas del sistema.
public class Context {

    private String NextOp = "";

    private int Operator = 0;

    private int Result = 0;

    public int getInteger(String in) {

        return switch (in.toLowerCase()) {
            case "cero" -> 0;
            case "uno" -> 1;
            case "dos" -> 2;
            case "tres" -> 3;
            case "cuatro" -> 4;
            case "cinco" -> 5;
            case "seis" -> 6;
            case "siete" -> 7;
            case "ocho" -> 8;
            case "nueve" -> 9;
            default -> -1;
        };
    }

    public void setOperator(int operator) {
        this.Operator = operator;
    }

    public void setOperation(String operation) {

        if(operation.equalsIgnoreCase("mas"))

            this.NextOp = "+";

        else if(operation.equalsIgnoreCase("menos"))

            this.NextOp = "-";
    }

    public void calculate() {

        if(this.NextOp.equals("") || this.NextOp.equals("+") )

            this.Result += Operator;

        else if(this.NextOp.equalsIgnoreCase("-"))

            this.Result -= Operator;

    }

    public int getResult() {

        return this.Result;

    }

}



