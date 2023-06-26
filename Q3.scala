def numaverage(n1:Float , n2:Float) : Float = {
  val value=(n1+n2)/2
  return value;
}
def main(args: Array[String]): Unit = {
      println("Enter Num1:")
      val Num1 = scala.io.StdIn.readInt()
      println("Enter Num2:")
      val Num2 = scala.io.StdIn.readInt()
      println("Your numbers are : " + Num1 + ", " + Num2)
      val average :Float=numaverage(Num1,Num2);
      println(f"Average of two numbers is : $average%1.2f");
    }
