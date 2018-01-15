package org.ford.fpsession.salary;

import java.util.function.BiFunction;

public interface SalaryFormulae {

     BiFunction<Integer, Integer, Double> developerFunction = (hours, overtime)-> hours* 200.0;

     BiFunction<Integer, Integer, Double> seniorDevFunction = (hours, overtime) -> hours* 1000.0;

     BiFunction<Integer, Integer, Double> contractorFunction = (hours, overtime) -> hours* 500.0+ overtime* 1000.0;


}
