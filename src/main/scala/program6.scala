object program6 {
    def main(args:Array[String]):Unit={
    val  a= scala.io.StdIn.readInt()
    val  b= scala.io.StdIn.readInt()
      print("enter the operator:+,-,*,'/:")
     val operator = scala.io.StdIn.readLine()
      val value = operator match {
        case "+" => a + b
        case "-" => a - b
        case "*" => a * b
        case "/" => a / b
      }
      print(value)

    }
}
