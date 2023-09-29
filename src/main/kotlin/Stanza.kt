class Stanza {
  fun text(beerCount: Int): String {
    return """
      $beerCount bottles of beer on the wall, $beerCount bottles of beer.
      Take one down and pass it around, ${beerCount - 1} bottles of beer on the wall.
    """.trimIndent()
  }
}
