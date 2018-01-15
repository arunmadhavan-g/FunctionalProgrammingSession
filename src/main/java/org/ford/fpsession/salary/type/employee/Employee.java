package org.ford.fpsession.salary.type.employee;

import lombok.EqualsAndHashCode;

import java.util.Random;
import java.util.function.BiFunction;

@EqualsAndHashCode
public abstract class Employee {

    private final int time;
    private final int overtime;
    private final BiFunction<Integer, Integer, Double> salaryFunction;

    protected Employee(int time, BiFunction<Integer, Integer, Double> salaryFunction){
        this(time, 0, salaryFunction);
    }

    protected Employee(int time, int overtime, BiFunction<Integer, Integer, Double> salaryFunction){
        this.time = time;
        this.overtime = overtime;
        this.salaryFunction = salaryFunction;
    }

    public abstract String getName();

    public String toString(){
        try {
            Thread.sleep(new Random().nextInt(2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return String.format("%s: %f", getName(), salaryFunction.apply(time, overtime));
    }

}
