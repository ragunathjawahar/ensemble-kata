class Stanza {
  fun drink(beerCount: Int): String {
    return when (beerCount) {
      0 -> {
        """
        No more bottles of beer on the wall, no more bottles of beer.
        Go to the store and buy some more, 99 bottles of beer on the wall.
      """
      }

      1 -> {
        """
        1 bottle of beer on the wall, 1 bottle of beer.
        Take one down and pass it around, no more bottles of beer on the wall.
      """
      }

      else -> {
        """
      $beerCount bottles of beer on the wall, $beerCount bottles of beer.
      Take one down and pass it around, ${beerCount - 1} bottles of beer on the wall.
    """
      }
    }.trimIndent()
  }

  fun drinkContinuously(beerCount: Int): String {
    return """
      $beerCount bottles of beer on the wall, $beerCount bottles of beer.
      Take one down and pass it around, ${beerCount - 1} bottles of beer on the wall.
      
      ${beerCount - 1} bottles of beer on the wall, ${beerCount - 1} bottles of beer.
      Take one down and pass it around, ${beerCount - 2} bottles of beer on the wall.
    """.trimIndent()
  }
}
