package com.Interpreter;

import java.util.ArrayList;

public class Interpreter {

    public static void interpretar(String [] operacion) {

        Context context = new Context();
        Expression exp;

        for(String token : operacion) {

            if(context.getInteger(token) >= 0) {
                exp = new NumericExpression(token);
            }
            else {
                exp = (new OperationExpression(token));
            }
            exp.interpret(context);
        }

        // Se muestra el resultado
        System.out.println("El resultado de la operacion es " + context.getResult());
    }
}
