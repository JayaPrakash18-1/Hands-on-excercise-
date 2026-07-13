import org.example.CalculatorJunitExp;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class CalculatorTest {
    private CalculatorJunitExp calculator;

    @BeforeEach
    public void setUp(){
        calculator=new CalculatorJunitExp();
    }
    @AfterEach
    public void tearDown(){
        System.out.println("Teardown: Test completed");
        calculator = null;
    }

    @Test
    public void testAdd(){
        // Arrange
        int a = 10;
        int b = 20;
        // Act
        int result = calculator.add(a, b);
        // Assert
        assertEquals(30, result);
    }

    @Test
    public void testSubract(){
        // Arrange
        int a = 10;
        int b = 20;
        // Act
        int result = calculator.subtract(a, b);
        // Assert
        assertEquals(-10, result);
    }
    @Test
    public void testMultiply(){
        // Arrange
        int a = 10;
        int b = 20;
        // Act
        int result = calculator.multiply(a, b);
        // Assert
        assertEquals(200, result);
    }
    @Test
    public void testDivide(){
        // Arrange
        int a = 100;
        int b = 20;
        // Act
        int result = calculator.divide(a, b);
        // Assert
        assertEquals(5, result);
    }
    @Test
    public void testAssertions() {
        // Assert equals
        assertEquals(5, 2 + 3);
        // Assert true
        assertTrue(5 > 6);
        // Assert false
        assertFalse(5 < 3);
        // Assert null
        assertNull(null);
        // Assert not null
        assertNotNull(new Object());
    }
}
