import com.example.AlexTheLion;
import com.example.Feline;
import org.junit.Assert;
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

    @Test
    public void checkThatLionHasNotAnyKitten() throws Exception {
        AlexTheLion lionAlex = new AlexTheLion(feline);
        lionAlex.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(0);
    }

    @Test
    public void checkWhatLionAlexLivesInTheZoo() throws Exception {
        AlexTheLion lionAlex = new AlexTheLion(feline);
        Assert.assertEquals("Лев Алекс живет не в зоопарке",zoo, lionAlex.getPlaceOfLiving());
    }

    @Test
    public void checkWhatLionAlexHasFriends() throws Exception {
        AlexTheLion lionAlex = new AlexTheLion(feline);
        Assert.assertEquals("Список друзей льва Алекса отличается от действительного", friends, lionAlex.getFriends());
    }
}