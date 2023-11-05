object program5 {
    def main(args:Array[String]):Unit={
      print("enter a number:")
      val n = scala.io.StdIn.readInt()
      if(n>=0 && n<=100){
        if(n>=90 && n<=100){
          print("super smart")
        }
        else if (n >= 80 && n <90) {
          print("smart")
        }
        else if (n >= 70 && n < 80) {
          print("smart enough")
        }
        else if (n >= 60 && n < 70) {
          print("just smart")
        }
        else if (n >= 35 && n < 60) {
          print("no smart")
        }
        else{
          print("dumb")
        }
      }
      else {
        print("invalid number")
      }

    }
}
