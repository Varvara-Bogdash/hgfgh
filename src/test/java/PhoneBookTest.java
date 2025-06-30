import org.junit.Test;
import static org.junit.Assert.*;
public class PhoneBookTest {
    @Test
    public void testAdd() {
        PhoneBook pb = new PhoneBook();
        assertEquals(1, pb.add("Alice", "123"));
        assertEquals(2, pb.add("Bob", "456"));
        assertEquals(2, pb.add("Alice", "789"));
        assertEquals(2, pb.add("Charlie", "123"));
    }
}
