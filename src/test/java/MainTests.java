
import com.goodline.Main;
import com.goodline.Pair;
import org.junit.jupiter.api.*;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class MainTests{

    @Test
    @DisplayName("\"a b a a b c c b c c\" expected c:4 a:3 b:3")
    public void test1(){
        String[] text = new String[]{"a", "b", "a", "a", "b", "c", "c", "b", "c", "c"};
        String[] orderedText = new String[]{"c", "a", "b"};
        int[] counters = new int[]{4, 3, 3};

        List<Pair> result = Main.frequencySort(text);

        int i=0;
        for (Pair p: result) {
            Assertions.assertEquals(p.getWord(), orderedText[i]);
            Assertions.assertEquals(p.getCounter(), counters[i]);
            i++;
        }
    }

    @Test
    @DisplayName("All repeat twice, alphabet sort should be used")
    public void test2(){
        String[] text = new String[]{"aba", "aba", "aab", "aab", "aaa", "aaa", "aa", "aa", "0", "0"};
        String[] orderedText = new String[]{"0", "aa", "aaa", "aab", "aba"};
        int[] counters = new int[]{2, 2, 2, 2, 2};

        List<Pair> result = Main.frequencySort(text);

        int i=0;
        for (Pair p: result) {
            Assertions.assertEquals(p.getWord(), orderedText[i]);
            Assertions.assertEquals(p.getCounter(), counters[i]);
            i++;
        }


    }

    @Test
    @DisplayName("the quick brown fox jumps over the lazy dog")
    public void test3(){
        String[] text = new String[]{"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String[] orderedText = new String[]{"the", "brown", "dog", "fox", "jumps", "lazy", "over", "quick"};
        int[] counters = new int[]{2, 1, 1, 1, 1, 1, 1, 1};

        List<Pair> result = Main.frequencySort(text);

        int i=0;
        for (Pair p: result) {
            Assertions.assertEquals(p.getWord(), orderedText[i]);
            Assertions.assertEquals(p.getCounter(), counters[i]);
            i++;
        }


    }
}
