package org.ford.fpsession.salary.type.employee;

import java.util.function.BiFunction;

public class Contractor extends  Employee{

    public Contractor(int time, int overtime, BiFunction<Integer, Integer, Double> salaryFunction){
        super(time, overtime, salaryFunction);
    }

    @Override
    public String getName() {
        return "Contractor";
    }
}
