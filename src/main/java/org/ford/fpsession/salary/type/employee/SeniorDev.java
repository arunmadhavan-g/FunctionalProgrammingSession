package org.ford.fpsession.salary.type.employee;

import java.util.function.BiFunction;

public class SeniorDev extends  Employee{

    public SeniorDev(int time, BiFunction<Integer, Integer, Double> salaryFunction){
       super(time, salaryFunction);
    }

    @Override
    public String getName() {
        return "Senior Dev";
    }
}
