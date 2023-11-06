object program28 {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 23) {
      if (i%5==0) {
        print("divisibleby five"+" ")
      }
      else if(i % 2 == 1) {
        print(i+" ")
      }
    }
  }
}
