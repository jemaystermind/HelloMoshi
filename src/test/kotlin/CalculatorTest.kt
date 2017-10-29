import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

internal class CalculatorTest {

  private lateinit var calculator: Calculator

  @Before
  fun setUp() {
    calculator = Calculator()
    println("Ready for testing!")
  }

  @After
  fun cleanUp() {
    println("Done with unit tests!")
  }

  @Test
  fun testAdd() {
    val total = calculator.add(1, 1)
    assertEquals("Calculator is not adding correctly", total, 2)
  }

  @Test
  fun testSubtract() {
    val total = calculator.subtract(2, 1)
    assertEquals(total, 1)
  }

  @Test
  fun testDivide() {
    val total = calculator.divide(4, 2)
    assertEquals(total, 2)
  }

  @Test(expected = ArithmeticException::class)
  fun testDivWithZeroDivisor() {
    val total = calculator.divide(1, 0)
    assertEquals("Calculator is not handling division by zero correctly", total, 0)
  }
}
