package org.ford.fpsession.io;

import org.ford.fpsession.salary.SalaryFormulae;
import org.ford.fpsession.salary.type.employee.Employee;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReadFromFile {

    public static Optional<List<Employee>> read(File file) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            List<Employee> employees = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] strings = line.split(",");
                employees.add(SalaryFormulae.createEmployee(strings[0].trim(), intOf(strings[1]), intOf(strings[2])));
            }
            return Optional.of(employees);
        }catch(IOException e){
          //  e.printStackTrace();
            return Optional.empty();
        }
    }

    private  static int intOf(String numberString) {
        return Integer.parseInt(numberString.trim());
    }
}
