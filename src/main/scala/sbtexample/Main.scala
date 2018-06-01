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
  println(s" Min values from list using reduceLeft:${a.reduceLeft(_ max _)}")
}
