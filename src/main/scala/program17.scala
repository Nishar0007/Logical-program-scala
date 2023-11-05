object program17 {
  def main(args: Array[String]): Unit = {
    var letter = 'a'

    while (letter <= 'z') {
      print(letter+" ")
      letter = (letter + 1).toChar
    }
  }

}
