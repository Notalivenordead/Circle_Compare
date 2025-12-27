import org.example.ArrayMaxFinder;
import org.example.Circle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayMaxFinderTest {

    @Test
    public void testFindMaxCircle() {
        Circle[] circles = {
                new Circle(1.0),
                new Circle(3.0),
                new Circle(2.0),
                new Circle(2.5)
        };

        Circle max = ArrayMaxFinder.findMaxCircle(circles);
        assertEquals(3.0, max.getRadius(), 1e-10);
    }

    @Test
    public void testFindMaxInteger() {
        Integer[] numbers = {5, 2, 8, 1, 9, 3};
        Integer max = ArrayMaxFinder.findMaxInteger(numbers);
        assertEquals(9, max);
    }

    @Test
    public void testFindMaxDouble() {
        Double[] numbers = {1.5, 3.7, 2.1, 4.9, 2.5};
        Double max = ArrayMaxFinder.findMaxDouble(numbers);
        assertEquals(4.9, max, 1e-10);
    }

    @Test
    public void testFindMaxString() {
        String[] strings = {"apple", "banana", "cherry", "date"};
        String max = ArrayMaxFinder.findMaxString(strings);
        assertEquals("date", max);
    }

    @Test
    public void testFindMaxGeneric() {
        Integer[] ints = {10, 20, 5, 15};
        assertEquals(20, ArrayMaxFinder.findMax(ints));

        String[] strs = {"a", "c", "b"};
        assertEquals("c", ArrayMaxFinder.findMax(strs));
    }

    @Test
    public void testFindMaxEmptyArray() {
        Integer[] empty = {};
        assertThrows(IllegalArgumentException.class, () -> ArrayMaxFinder.findMax(empty));
    }

    @Test
    public void testFindMaxNullArray() {
        assertThrows(IllegalArgumentException.class, () -> ArrayMaxFinder.findMax(null));
    }

    @Test
    public void testFindMaxSingleElement() {
        Circle[] single = {new Circle(5.0)};
        Circle max = ArrayMaxFinder.findMax(single);
        assertEquals(5.0, max.getRadius(), 1e-10);
    }

    @Test
    public void testFindMaxIndex() {
        Circle[] circles = {
                new Circle(1.0),
                new Circle(3.0),
                new Circle(2.0)
        };

        int maxIndex = ArrayMaxFinder.findMaxIndex(circles);
        assertEquals(1, maxIndex);
    }

    @Test
    public void testFindMin() {
        Integer[] numbers = {5, 2, 8, 1, 9, 3};
        Integer min = ArrayMaxFinder.findMin(numbers);
        assertEquals(1, min);
    }

    @Test
    public void testAllEqualElements() {
        Circle[] circles = {
                new Circle(2.0),
                new Circle(2.0),
                new Circle(2.0)
        };

        Circle max = ArrayMaxFinder.findMax(circles);
        assertEquals(2.0, max.getRadius(), 1e-10);
    }

    @Test
    public void testNegativeNumbers() {
        Integer[] numbers = {-5, -2, -8, -1};
        Integer max = ArrayMaxFinder.findMax(numbers);
        assertEquals(-1, max);
    }

    @Test
    public void testMixedNumbers() {
        Integer[] numbers = {-5, 0, 5, -10, 10};
        Integer max = ArrayMaxFinder.findMax(numbers);
        assertEquals(10, max);
    }
}