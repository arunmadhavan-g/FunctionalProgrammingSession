import org.ford.fpsession.io.ReadFromFile;
import org.ford.fpsession.salary.SalaryFormulae;
import org.ford.fpsession.salary.type.employee.Developer;
import org.ford.fpsession.salary.type.employee.Employee;
import org.junit.Test;

import java.io.File;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ReadFromFileTest {

    @Test
    public void readFromFile() {
        List<Employee> employees = ReadFromFile
                                        .read(new File("/Users/arunmadhavang/Workspace/Postfacto-server/fpsession/src/test/resources/test.csv"))
                                        .get();
        assertThat(employees).hasSize(3);
        assertThat(employees).contains(new Developer(160, SalaryFormulae.developerFunction));
    }



}
