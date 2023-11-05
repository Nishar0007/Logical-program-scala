object program4 {
    def main(args:Array[String]):Unit={
    //Store a number in variable
      print("enter the number:")
      val  n  = scala.io.StdIn.readDouble()
      println(n)

      if(n>=100 && n<=1000){
        if(n%2==0){
          print(n/3)
        }
        else if(n%2==1){
          print(n/2)
        }
      }
      else{
        print("invalid")
      }
  }
}
