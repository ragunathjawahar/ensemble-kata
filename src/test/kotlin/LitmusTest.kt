import com.google.common.truth.Truth.assertThat
import org.approvaltests.Approvals
import org.junit.jupiter.api.Test

class LitmusTest {
  @Test
  fun `test environment is setup`() {
    assertThat(true)
      .isTrue()
  }

  @Test
  fun `approvals is setup`() {
    Approvals.verify("Hello World!")
  }
}
