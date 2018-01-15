package org.ford.fpsession.salary;

import org.ford.fpsession.salary.type.employee.Contractor;
import org.ford.fpsession.salary.type.employee.Developer;
import org.ford.fpsession.salary.type.employee.Employee;
import org.ford.fpsession.salary.type.employee.SeniorDev;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import static org.ford.fpsession.salary.SalaryFormulae.*;
import static org.ford.fpsession.util.Timing.timing;

public class SalaryCalculator {

    private static final Logger logger = Logger.getLogger(SalaryCalculator.class.getName());


    public String salaries(int time, int overtime) {
        return salariesOf(
                            new Developer(time, developerFunction),
                            new SeniorDev(time, seniorDevFunction),
                            new Contractor(time, overtime, contractorFunction)
                        );

    }

    private String salariesOf(Developer dev, SeniorDev seniorDev, Contractor contractor){
        StringBuilder builder = new StringBuilder();
        builder.append(timing("Developer",() ->dev.toString(), logger::info)).append("\n");
        builder.append(timing("Senior Dev",() -> seniorDev.toString())).append("\n");
        builder.append(timing("Contractor", ()-> contractor.toString()));
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(new SalaryCalculator().salaries(160, 20));
    }

}
