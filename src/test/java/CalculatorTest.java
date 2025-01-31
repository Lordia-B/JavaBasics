//import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class CalculatorTest {
    private Calculator calc;

    @BeforeAll
    static void BeforeAll(){
        System.out.println("Setting up for shared resources");
    }

    @BeforeEach
    void setup(){
        calc = new Calculator();
    }

    @AfterEach
    void AfterEach(){
        System.out.println("Test completed");

    }

    @AfterAll
    static void AfterAll(){
        System.out.println("This cleans up the shared resources after all methods have run ");

    }

    @Test
    void AdditionSign() {
        //Calculator calc = new Calculator();
        int result = calc.performOperation(5, 6, '+');
        assertEquals(11, result, "Test didn't run");

    }

    @Test
    void SubtractionSign(){
        int result = calc.performOperation(8, 6 , '-');
        assertEquals(2, result );
    }
}