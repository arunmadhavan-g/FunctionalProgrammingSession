package org.ford.fpsession.salary;

import org.ford.fpsession.salary.type.employee.Contractor;
import org.ford.fpsession.salary.type.employee.Developer;
import org.ford.fpsession.salary.type.employee.Employee;
import org.ford.fpsession.salary.type.employee.SeniorDev;

import java.util.function.BiFunction;

public interface SalaryFormulae {

     BiFunction<Integer, Integer, Double> developerFunction = (hours, overtime)-> hours* 200.0;

     BiFunction<Integer, Integer, Double> seniorDevFunction = (hours, overtime) -> hours* 1000.0;

     BiFunction<Integer, Integer, Double> contractorFunction = (hours, overtime) -> hours* 500.0+ overtime* 1000.0;


     public static Employee createEmployee(String type, int hours, int overtime){
         switch(type){
             case "Developer" : return new Developer(hours, developerFunction);
             case "Senior Dev" : return new SeniorDev(hours, seniorDevFunction);
             case "Contractor" : return new Contractor(hours, overtime, contractorFunction);
         }
         return null;
     }

}
