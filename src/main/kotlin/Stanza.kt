class Stanza {
  fun drink(beerCount: Int): String {

    val initialBeerCountStr = getInitialBeerCountStr(beerCount)
    val leftOutBeerCountStr = getLeftOutBeerCount(beerCount)

    val initialBeerCountStrOnWall = """$initialBeerCountStr on the wall"""
    val leftOutBeerCountStrOnWall = """$leftOutBeerCountStr on the wall"""

    return when (beerCount) {
      0 -> {
        val initialBeerCountLowerCaseStr = initialBeerCountStr.replaceFirstChar { it.toLowerCase() }
        """
        $initialBeerCountStrOnWall, ${initialBeerCountLowerCaseStr}.
        Go to the store and buy some more, ${leftOutBeerCountStrOnWall}.
      """
      }
      else -> {
        """
      $initialBeerCountStrOnWall, ${initialBeerCountStr}.
      Take one down and pass it around, ${leftOutBeerCountStrOnWall}.
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
    return "$leftOutBeerCountStr of beer"
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
    return "$initialBeerCountStr of beer"
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
