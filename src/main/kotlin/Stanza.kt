class Stanza {
  fun drink(beerCount: Int): String {

    val initialBeerCountStr = when (beerCount) {
      0 -> {
        """No more bottles"""
      }

      1 -> {
        """1 bottle"""
      }

      else -> {
        """$beerCount bottles"""
      }
    }

    return when (beerCount) {
      0 -> {
        val leftOutBeerCountStr = """99 bottles"""
        val initialBeerCountLowerCaseStr = initialBeerCountStr.replaceFirstChar { it.toLowerCase() }
        """
        $initialBeerCountStr of beer on the wall, $initialBeerCountLowerCaseStr of beer.
        Go to the store and buy some more, $leftOutBeerCountStr of beer on the wall.
      """
      }

      1 -> {
        val leftOutBeerCountStr = """no more bottles"""
        """
        $initialBeerCountStr of beer on the wall, $initialBeerCountStr of beer.
        Take one down and pass it around, $leftOutBeerCountStr of beer on the wall.
      """
      }

      else -> {
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

    (beerCount downTo beerCount - 1).forEach {
      builder.append(drink(it))
      builder.append("\n\n")
    }

    return builder.trim().toString();
  }
}
