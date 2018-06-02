package sbtexample

/**
  * Created by Santosh.Ganapa on 24-05-2018.
  */

/**
Reference URL for details:
URL: https://docs.scala-lang.org/getting-started-intellij-track/building-a-scala-project-with-intellij-and-sbt.html
  *
  */
object Main extends App {

  // reduceLeft Demo
  val a = Array(12, 2, 15, 2, 20, 10, 9)
  println(s" Sum of all numbers using reduceLeft:${a.reduceLeft(_+_)}")  //OR
  println(s" Sum of all numbers using reduceLeft:${a.reduceLeft((x,y) => x + y)}")
  println(s" Multiplication using reduceLeft:${a.reduceLeft(_ * _)}")
  println(s" Min values from list using reduceLeft:${a.reduceLeft(_ min _)}")
  println(s" Max values from list using reduceLeft:${a.reduceLeft(_ max _)}")


  // returns the max of the two elements
  val findMax = (x: Int, y: Int) => {
    val winner = x max y
    println(s"compared $x to $y, $winner was larger")
    winner
  }

  //Now call reduceLeft again on the array, this time giving it the findMax function:
  println(s" Min values from list using findMax and reduceLeft:${a.reduceLeft(_ max _)}")

  // Find longest & shortest string from list of strings
  val names = Vector("Om", "Sai", "Ganesh", "Ram", "Yamaha")
  println(s"Names:$names")
  val longestString = names.reduceLeft((x,y) => if(x.length > y.length) x else y)
  val shortestString = names.reduceLeft((x,y) => if(x.length < y.length) x else y)

  println(s"LongestString:$longestString  ShortestString:$shortestString")

  /*****
    * The difference between reduceLeft and reduceRight
  In many algorithms, it may not matter if you call reduceLeft or reduceRight.
  In that case, you can call reduce instead. The reduce Scaladoc states, “The order in which operations
  are performed on elements is unspecified and may be nondeterministic.”
    ******/
  println(s"LongestString using reduce: ${names.reduce((x,y)=> if(x.length>y.length) x else y)}")
  println(s"ShortestString using reduce: ${names.reduce((x,y)=> if(x.length<y.length) x else y)}")
}