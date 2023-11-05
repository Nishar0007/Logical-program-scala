object Program2 {
  def main(args: Array[String]): Unit = {
    val c = scala.io.StdIn.readInt()
    val f = (c * 9 / 5) + 32
    print(c+"°C="+f+"°F")
  }
}
