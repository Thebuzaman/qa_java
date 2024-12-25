import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTests {
    @Mock
    Feline feline;

    @Test
    public void checkThatLionHasOneKitten() throws Exception {
        Lion lion = new Lion(feline, "Самка");
        Mockito.when(feline.getKittens()).thenReturn(1);
        Assert.assertEquals("У львов один детеныш",1, lion.getKittens());

    }

    @Test
    public void checkThatLionHasFoodLikeFeline() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }
}