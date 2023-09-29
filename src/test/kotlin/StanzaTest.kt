import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class StanzaTest {
  @Test
  fun `print first stanza`() {
    // given
    val stanza = Stanza()

    //when
    val text = stanza.drink(99)

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
    val text = stanza.drink(0)

    //then
    assertThat(text).isEqualTo(
      """
      No more bottles of beer on the wall, no more bottles of beer.
      Go to the store and buy some more, 99 bottles of beer on the wall.
      """.trimIndent()
    )
  }

  @Test
  fun `print second last stanza`() {
    // given
    val stanza = Stanza()

    //when
    val text = stanza.drink(1)

    //then
    assertThat(text).isEqualTo(
      """
      1 bottle of beer on the wall, 1 bottle of beer.
      Take one down and pass it around, no more bottles of beer on the wall.
      """.trimIndent()
    )
  }

  @Test
  fun `print consecutive stanzas`() {
    // given
    val stanza = Stanza()

    //when
    val text = stanza.drinkContinuously(10)

    //then
    assertThat(text).isEqualTo(
      """
      10 bottles of beer on the wall, 10 bottles of beer.
      Take one down and pass it around, 9 bottles of beer on the wall.

      9 bottles of beer on the wall, 9 bottles of beer.
      Take one down and pass it around, 8 bottles of beer on the wall.
      """.trimIndent()
    )
  }
}
