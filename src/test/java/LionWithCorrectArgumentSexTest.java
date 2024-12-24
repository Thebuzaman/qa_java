import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

@RunWith(Parameterized.class)
public class LionWithCorrectArgumentSexTest {

    Feline feline = Mockito.spy(new Feline());

    private final String sex;
    private final boolean expectedHasMane;

    public LionWithCorrectArgumentSexTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.expectedHasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void checkWhenLeonHasMane() throws Exception {
        Lion lion = new Lion(feline, this.sex);
        boolean actualHasMane = lion.doesHaveMane();
        Assert.assertEquals("Самец должен быть с гривой, самка - без гривы", expectedHasMane, actualHasMane);
    }

    @Test
    public void checkThatLionHasOneKitten() throws Exception {
        Lion lion = new Lion(feline, this.sex);
        lion.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(1);

    }

    @Test
    public void checkThatLionHasFoodLikeFeline() throws Exception {
        Lion lion = new Lion(feline, this.sex);
        lion.getFood();
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
    }

}