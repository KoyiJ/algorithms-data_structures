import com.koyi.Array;
import org.junit.jupiter.api.Test;

/**
 * @auther jiangtianhe
 * @date 2024/8/1
 */
public class ArrayTest {

    @Test
    public void testAdd() {
        Array array = new Array();
        for (int i = 0; i < 100; i++) {
            array.add(i);
        }
    }
}
