import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void shouldReturn1When1() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("1", fb.getResult(1));
    }
}
