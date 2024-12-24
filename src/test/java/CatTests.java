import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CatTests {
    @Spy
    private Feline feline;

    @Test
    public void checkThatCatHasFoodLikeFeline() throws Exception {
        Cat cat = new Cat(feline);
        Assert.assertEquals("Кошка не питается как хищник",feline.getFood("Хищник"), cat.getFood());
    }

    @Test
    public  void checkThatCatHasSoundMyo() {
        Cat cat = new Cat(feline);
        Assert.assertEquals("Кошка не умеет мяукать","Мяу", cat.getSound());
    }

}
