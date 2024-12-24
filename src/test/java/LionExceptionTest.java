import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionExceptionTest {
    @Mock
    Feline feline;

    @Test(expected = Exception.class)
    public void whenExceptionThrownThenExpectationSatisfied() throws Exception {
        new Lion(feline, "");
    }
}