import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FelineTests {
    @Spy
    private Feline feline;

    @Test
    public void checkThatFelineEatsMeat() throws Exception {
        feline.eatMeat();
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
    }

    @Test
    public  void checkThatFelineHasFamily() {
        Assert.assertEquals("Не относится к семейству кошачих","Кошачьи", feline.getFamily());
    }

    @Test
    public void checkCountOfKittensMoreWhenOne() {
        Assert.assertEquals("Не верное количество катят",10, feline.getKittens(10));
    }

    @Test
    public void checkCountOfKittensIsOne() {
        feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
    }
}
