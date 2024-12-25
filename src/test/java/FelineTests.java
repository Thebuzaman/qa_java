import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTests {

    @Test
    public void checkThatFelineEatsMeat() throws Exception {
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), new Feline().eatMeat());
    }

    @Test
    public  void checkThatFelineHasFamily() {
        Assert.assertEquals("Не относится к семейству кошачих","Кошачьи", new Feline().getFamily());
    }

    @Test
    public void checkCountOfKittensMoreWhenOne() {
        Assert.assertEquals("Не верное количество детенышей",10, new Feline().getKittens(10));
    }

    @Test
    public void checkCountOfKittensIsOne() {
        Feline feline = new Feline();
        Assert.assertEquals("Количество детенышей - один", feline.getKittens(1),feline.getKittens());
    }
}
