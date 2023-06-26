def filteredlist(list: List[String]): List[String] = {
  list.filter(_.length > 5)
}
def main(args: Array[String]): Unit = {
val beforelist = List("chinthana", "dinu", "gineth", "monty", "kiwi")
val afterlist = filteredlist(beforelist)
println(afterlist) 
}