class Stanza {
  fun drink(beerCount: Int): String {

    val initialBeerCountStr = getInitialBeerCountStr(beerCount)
    val leftOutBeerCountStr = getLeftOutBeerCount(beerCount)

    val initialBeerCountStrOnWall = """$initialBeerCountStr of beer on the wall"""
    val leftOutBeerCountStrOnWall = """$leftOutBeerCountStr of beer on the wall."""

    return when (beerCount) {
      0 -> {
        val initialBeerCountLowerCaseStr = initialBeerCountStr.replaceFirstChar { it.toLowerCase() }
        """
        $initialBeerCountStrOnWall, $initialBeerCountLowerCaseStr of beer.
        Go to the store and buy some more, $leftOutBeerCountStrOnWall
      """
      }
      else -> {
        """
      $initialBeerCountStrOnWall, $initialBeerCountStr of beer.
      Take one down and pass it around, $leftOutBeerCountStrOnWall
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
