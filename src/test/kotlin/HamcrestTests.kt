import junit.framework.TestCase.assertTrue
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.core.IsCollectionContaining.hasItems
import org.junit.Test

internal class HamcrestTests {
  @Test
  fun testWithAsserts() {
    val list = generateStringList()
    assertTrue(list.contains("android"))
    assertTrue(list.contains("context"))
    assertTrue(list.size > 4)
    assertTrue(list.size < 13)
  }

  @Test
  fun testWithBigAssert() {
    val list = generateStringList()
    assertTrue(list.contains("android") && list.contains("context") &&
        list.size > 3 && list.size < 12)
  }

  @Test
  fun testWithHamcrest() {
    val list = generateStringList()
    assertThat(list, hasItems("android", "context"))
  }

  private fun generateStringList() = listOf("android", "context", "service", "manifest", "layout",
      "resource", "broadcast", "receiver", "gradle")
}
