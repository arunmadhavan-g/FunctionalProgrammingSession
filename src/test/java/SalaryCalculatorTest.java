import org.ford.fpsession.salary.SalaryCalculator;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SalaryCalculatorTest {

    private SalaryCalculator salCalc = new SalaryCalculator();

    @Test
    public void returnFormattedSalaries(){
        String expectedString = String.format("Developer: %f\nSenior Dev: %f\nContractor: %f", 32000.0, 160000.0,100000.0 );
        assertThat(salCalc.salaries(160, 20)).isEqualTo(expectedString);
    }


}
