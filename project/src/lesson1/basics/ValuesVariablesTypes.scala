package src.main.scala.Lesson1.basics

object ValuesVariablesTypes extends App {


  //values
  val x: Int = 42
  print(x)
  // vals are immutable
  // compiler can infer types

  val aString: String = "hello"
  val anotherString = "goodbye"

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 4562
  val aLong: Long = 46546546575L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14

  //variables

  var aVariable: Int = 4

  aVariable = 5 // side effects




}
