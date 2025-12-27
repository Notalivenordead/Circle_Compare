import org.example.Circle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {

    @Test
    public void testCircleCreation() {
        Circle circle = new Circle(5.0);
        assertEquals(5.0, circle.getRadius(), 1e-10);
    }

    @Test
    public void testCircleInvalidRadius() {
        assertThrows(IllegalArgumentException.class, () -> new Circle(0));
        assertThrows(IllegalArgumentException.class, () -> new Circle(-1));
    }

    @Test
    public void testArea() {
        Circle circle = new Circle(1.0);
        assertEquals(Math.PI, circle.getArea(), 1e-10);

        Circle circle2 = new Circle(2.0);
        assertEquals(4 * Math.PI, circle2.getArea(), 1e-10);
    }

    @Test
    public void testCircumference() {
        Circle circle = new Circle(1.0);
        assertEquals(2 * Math.PI, circle.getCircumference(), 1e-10);
    }

    @Test
    public void testCompareTo() {
        Circle small = new Circle(1.0);
        Circle medium = new Circle(2.0);
        Circle large = new Circle(3.0);

        assertTrue(small.compareTo(medium) < 0);
        assertTrue(medium.compareTo(small) > 0);
        assertEquals(0, small.compareTo(new Circle(1.0)));
        assertTrue(large.compareTo(medium) > 0);
    }

    @Test
    public void testEquals() {
        Circle c1 = new Circle(2.5);
        Circle c2 = new Circle(2.5);
        Circle c3 = new Circle(3.0);

        assertEquals(c1, c2);
        assertNotEquals(c1, c3);
    }

    @Test
    public void testToString() {
        Circle circle = new Circle(2.5);
        String str = circle.toString();
        assertTrue(str.contains("2,50"));
        assertTrue(str.contains("area"));
    }
}