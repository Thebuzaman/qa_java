import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

    private final String sex;
    private final boolean expectedHasMane;
    private String expectedException = "Используйте допустимые значения пола животного - самец или самка";

    public LionParameterizedTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.expectedHasMane = hasMane;
    }

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    @Mock
    private Feline feline;

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
                {"Котенок", false}
        };
    }

    @Test
    public void checkWhenLeonHasMane() throws Exception {
        try {
            Lion lion = new Lion(feline, sex);
            boolean actualHasMane = lion.doesHaveMane();
            Assert.assertEquals("Самец должен быть с гривой, самка - без гривы", expectedHasMane, actualHasMane);
        } catch (Exception exception) {
            Assert.assertEquals(expectedException, exception.getMessage());
        }
    }

}