import com.google.common.truth.Truth.assertThat
import com.google.common.truth.Truth.assertWithMessage
import org.junit.Test

internal class TruthTests {
  @Test
  fun testHello() {
    val text = "foo"
    assertThat(text).startsWith("fo")
    assertWithMessage("Foo").that(text).isEqualTo("foo")
  }
}
