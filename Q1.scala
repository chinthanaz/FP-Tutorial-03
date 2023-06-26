
  def reverse(input: String): String = {
    if (input.length==0) {
      ""
    } else {
      reverse(input.tail) + input.head
    }
  }

  def main(args: Array[String]): Unit = {
      println("Enter your string:")
      val userInput = scala.io.StdIn.readLine()
      println("Your string is : " + userInput)

      
      val reversedstring = reverse(userInput)
      println("Reversed string is : " + reversedstring)
    }
  
