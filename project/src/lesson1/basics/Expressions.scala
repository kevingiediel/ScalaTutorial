package src.main.scala.Lesson1.basics

object Expressions extends  App{

  val x = 1 + 2 // Expression
  println(x)

  println (2 + 3 * 4)

  println(1 == x)

  var aVariable = 2
  aVariable += 3 // also works with -= *= /= ... side effects

  println(aVariable)

  //Instructions vs Expressions (Value)

  // If expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 // IF Expression
  println((aConditionedValue))


  var i = 0
  while (i < 10){
    println(i)
    i += 1
  }

  //NEVER WRITE THIS AGAIN.
  // Everything in Scala is an Expression

  val aWeirdValue = (aVariable = 3) // Unit === void
  println(aWeirdValue)

  // side effects: println(), whiles, reassigning

  //code blocks

  val aCodeBlock = {
    val y = 2
    val z = y + 1
    if (z > 2) "hello" else "goodbye"
  }

}
