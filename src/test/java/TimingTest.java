import org.ford.fpsession.util.Timing;
import org.junit.Test;

import java.util.concurrent.atomic.AtomicReference;

import static org.assertj.core.api.Assertions.*;

public class TimingTest {

    @Test
    public void timingPrints(){
        AtomicReference<String> atomicReference = new AtomicReference<>();
        Timing.timing("test Desc", () -> TimingTest.class.getName(), atomicReference::set);

        System.out.println(atomicReference.get());
        assertThat(atomicReference.get()).contains("test Desc");

    }
}
