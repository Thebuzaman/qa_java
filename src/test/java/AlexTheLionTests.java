import com.example.AlexTheLion;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class AlexTheLionTests {
    @Mock
    Feline feline;

    String zoo = "Нью-Йоркский зоопарк";
    List<String> friends = List.of("Марти", "Глория", "Мелман");
    AlexTheLion lionAlex;
    @Before
    public void init() throws Exception {
        lionAlex = new AlexTheLion(feline);
    }

    @Test
    public void checkThatLionHasNotAnyKitten() throws Exception {
        lionAlex.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(0);
    }

    @Test
    public void checkWhatLionAlexLivesInTheZoo() throws Exception {
        Assert.assertEquals("Лев Алекс живет не в зоопарке",zoo, lionAlex.getPlaceOfLiving());
    }

    @Test
    public void checkWhatLionAlexHasFriends() throws Exception {
        Assert.assertEquals("Список друзей льва Алекса отличается от действительного", friends, lionAlex.getFriends());
    }
}