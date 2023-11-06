object program30 {
  def main(args: Array[String]): Unit = {
    val range = Stream.continually(1 to 10)
      for (i <- range){
        println(i)
      }
    }

}
