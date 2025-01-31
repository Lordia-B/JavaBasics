import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathTest {

    @Test
    void add() {
        Math math = new Math(5,6);
        int result = math.add();
        assertEquals(11, result);


    }

}