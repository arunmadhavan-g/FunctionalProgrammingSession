import org.ford.fpsession.io.Outputter;
import org.ford.fpsession.io.ReadFromFile;
import org.ford.fpsession.salary.type.employee.Employee;
import org.junit.Test;

import java.io.File;
import java.util.Optional;
import java.util.stream.Collectors;

public class ChainTest {

    @Test
    public void transform(){

                Optional
                        .of("/Users/arunmadhavang/Workspace/Postfacto-server/fpsession/src/test/resources/test.csv")
                        .map(fileName -> new File(fileName))
                        .flatMap(ReadFromFile::read)
                        .map(employees -> employees.stream()
                                    .map(Employee::toString)
                                        .collect(Collectors.toList()))
                        .ifPresent(Outputter::printToConsole);

    }

}

