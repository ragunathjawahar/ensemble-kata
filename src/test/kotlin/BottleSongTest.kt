import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class BottleSongTest {
  @Test
  fun `print first stanza`() {
    // given
    val stanza = Stanza();

    //when
    val text = stanza.text();

    //then
    assertThat(text).isEqualTo(
      """
        99 bottles of beer on the wall, 99 bottles of beer.
        Take one down and pass it around, 98 bottles of beer on the wall.
      """.trimIndent()
    )
  }
}
