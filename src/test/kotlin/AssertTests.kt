import org.junit.Test

import org.junit.Assert.*
import org.hamcrest.CoreMatchers.*
import org.hamcrest.core.CombinableMatcher

internal class AssertTests {
  @Test
  fun testAssertArrayEquals() {
    val expected = "test".toByteArray()
    val actual = "test".toByteArray()

    assertArrayEquals("Byte arrays not the same", expected, actual)
  }

  @Test
  fun testAssertEquals() {
    assertEquals("text", "text")
  }

  @Test
  fun testAssertFalse() {
    assertFalse("Should be false", false)
  }

  @Test
  fun testAssertNotNull() {
    assertNotNull("Should not be null", Any())
  }

  @Test
  fun testAssertNotSame() {
    assertNotSame("Should not be same object", Any(), Any())
  }

  @Test
  fun testAssertNull() {
    assertNull("Should be null", null)
  }

  @Test
  fun testAssertSame() {
    val expected = 13
    val actual = 13
    assertSame("Should be the same", expected, actual)
  }

  @Test
  fun testAssertThatBothContainsString() {
    // Contains both a and b string
    assertThat("albumen", both(containsString("a")).and(containsString("b")))
  }

  @Test
  fun testAssertThatHasItems() {
    assertThat(listOf("one", "two", "three"), hasItems("one", "three"))
  }

  @Test
  fun testAssertThatEveryArrayItemContainsString() {
    assertThat(listOf("far", "bar", "bazz"), everyItem(containsString("a")))
  }

  @Test
  fun testAssertThatHamcrestCoreMatchers() {
    // Must be equal to and starts with "good"
    // allof() is like AND operator
    assertThat("good", allOf(equalTo("good"), startsWith("good")))

    assertThat("good", not(allOf(equalTo("bad"), equalTo("good"))))

    // anyof() is like OR operator
    assertThat("good", anyOf(equalTo("bad"), equalTo("good")))

    assertThat(7, not(CombinableMatcher.either(equalTo(3)).or(equalTo(4))))

    assertThat(Any(), not(sameInstance(Any())))
  }
}
