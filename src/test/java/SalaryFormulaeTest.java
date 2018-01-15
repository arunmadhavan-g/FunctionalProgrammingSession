import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.ford.fpsession.salary.SalaryFormulae.*;

public class SalaryFormulaeTest {

    @Test
    public void developerSalaryIs200TimesTimeClocked(){
        assertThat(developerFunction.apply(160,0)).isEqualTo(32000);
    }

    @Test
    public void seniorDevSalaryIs1000TimesTimeClocked(){
        assertThat(seniorDevFunction.apply(160,0)).isEqualTo(160000);
    }

    @Test
    public void contractorSalaryIs500TimesTimeClockedAnd1000TimesOvertimeClocked(){
        assertThat(contractorFunction.apply(160, 20)).isEqualTo(100000);
    }

}


