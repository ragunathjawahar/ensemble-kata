class Stanza {
  fun drink(beerCount: Int): String {
    return when (beerCount) {
      0 -> {
        val initialBeerCountStr = """No more bottles"""
        val leftOutBeerCountStr = """99 bottles"""
        """
        $initialBeerCountStr of beer on the wall, no more bottles of beer.
        Go to the store and buy some more, $leftOutBeerCountStr of beer on the wall.
      """
      }

      1 -> {
        val initialBeerCountStr = """1 bottle"""
        val leftOutBeerCountStr = """no more bottles"""
        """
        $initialBeerCountStr of beer on the wall, $initialBeerCountStr of beer.
        Take one down and pass it around, $leftOutBeerCountStr of beer on the wall.
      """
      }

      else -> {
        val initialBeerCountStr = """$beerCount bottles"""
        val leftOutBeerCountStr = """${beerCount - 1} bottles"""
        """
      $initialBeerCountStr of beer on the wall, $initialBeerCountStr of beer.
      Take one down and pass it around, $leftOutBeerCountStr of beer on the wall.
    """
      }
    }.trimIndent()
  }

  fun drinkContinuously(beerCount: Int): String {
    val builder = StringBuilder()

    (beerCount downTo beerCount-1).forEach {
      builder.append(drink(it))
      builder.append("\n\n")
    }

    return builder.trim().toString();
  }
}
