import org.junit.Assert.assertEquals
import org.junit.Test

internal class HelloKtTest {
  @Test
  fun tetSayHello() {
    val hello = sayHello()
    assertEquals(hello, "Hello")
  }
}
