class Stanza {
  fun drink(beerCount: Int): String {

    val initialBeerCountStr = getInitialBeerCountStr(beerCount)
    val leftOutBeerCountStr = getLeftOutBeerCount(beerCount)

    return when (beerCount) {
      0 -> {
        val initialBeerCountLowerCaseStr = initialBeerCountStr.replaceFirstChar { it.toLowerCase() }
        """
        $initialBeerCountStr of beer on the wall, $initialBeerCountLowerCaseStr of beer.
        Go to the store and buy some more, $leftOutBeerCountStr of beer on the wall.
      """
      }

      1 -> {
        """
        $initialBeerCountStr of beer on the wall, $initialBeerCountStr of beer.
        Take one down and pass it around, $leftOutBeerCountStr of beer on the wall.
      """
      }

      else -> {
        """
      $initialBeerCountStr of beer on the wall, $initialBeerCountStr of beer.
      Take one down and pass it around, $leftOutBeerCountStr of beer on the wall.
    """
      }
    }.trimIndent()
  }

  private fun getLeftOutBeerCount(beerCount: Int): String {
    val leftOutBeerCountStr = when (beerCount) {
      0 -> {
        """99 bottles"""
      }

      1 -> {
        """no more bottles"""
      }

      else -> {
        """${beerCount - 1} bottles"""
      }
      }
    return leftOutBeerCountStr
  }

  private fun getInitialBeerCountStr(beerCount: Int): String {
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
    return initialBeerCountStr
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
