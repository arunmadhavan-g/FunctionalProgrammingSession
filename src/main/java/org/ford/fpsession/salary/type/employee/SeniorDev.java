package org.ford.fpsession.salary.type.employee;

import lombok.EqualsAndHashCode;

import java.util.function.BiFunction;

@EqualsAndHashCode
public class SeniorDev extends  Employee{

    public SeniorDev(int time, BiFunction<Integer, Integer, Double> salaryFunction){
       super(time, salaryFunction);
    }

    @Override
    public String getName() {
        return "Senior Dev";
    }
}
