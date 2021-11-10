import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void shouldReturn1When1() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("1", fb.getResult(1));
    }

    @Test
    void shouldReturn2When2() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("2", fb.getResult(2));
    }
}
