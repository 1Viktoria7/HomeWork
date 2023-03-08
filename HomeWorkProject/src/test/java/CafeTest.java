import org.example.Cafe;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CafeTest {
    @Test
    public void shouldSetWorkTime() {
        Cafe cafe = new Cafe();
        cafe.setWorkTime(12, 20);
        Assertions.assertEquals("12:00 - 20:00", cafe.getWorkTime());
    }
    @Test
    public void shouldAddWeekends() {
        Cafe cafe = new Cafe();
        cafe.addWeekend("Среда");
        Assertions.assertEquals(8, cafe.weekends.size());
    }
    @Test
    public void shouldRemoveWeekends() {
        Cafe cafe = new Cafe();
        cafe.removeWeekend("Четверг");
        Assertions.assertEquals(6,cafe.weekends.size());
    }


}
