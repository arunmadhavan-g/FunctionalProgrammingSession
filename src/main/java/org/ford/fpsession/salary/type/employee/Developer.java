package org.ford.fpsession.salary.type.employee;

import java.util.function.BiFunction;

public class Developer extends  Employee{

    public Developer(int time, BiFunction<Integer, Integer, Double> salaryFunction){
    super(time, salaryFunction);
    }

    @Override
    public String getName() {
        return "Developer";
    }


}
