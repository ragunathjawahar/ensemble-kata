import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class StanzaTest {
  @Test
  fun `print first stanza`() {
    // given
    val stanza = Stanza()

    //when
    val text = stanza.text(99)

    //then
    assertThat(text).isEqualTo(
      """
        99 bottles of beer on the wall, 99 bottles of beer.
        Take one down and pass it around, 98 bottles of beer on the wall.
      """.trimIndent()
    )
  }

  @Test
  fun `print last stanza`() {
    // given
    val stanza = Stanza()

    //when
    val text = stanza.text(0)

    //then
    assertThat(text).isEqualTo(
      """
      No more bottles of beer on the wall, no more bottles of beer.
      Go to the store and buy some more, 99 bottles of beer on the wall.
      """.trimIndent()
    )
  }
}
