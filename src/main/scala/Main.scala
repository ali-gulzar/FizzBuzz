object FizzBuzz {

  /**
    * @breif - Take the user input and change the user input to FizzGame logical Sequence
    * @param inputSeq - Array provided by the users - Seq[Int]
    * @return resultSeq - FizzBuzz game array - Seq[String]
    */
  def result(inputSeq: Seq[Int]):Seq[String] = {

    var resultSeq = Seq[String]()

    inputSeq.foreach( element => {
      if (element % 5 == 0 && element % 3 == 0){resultSeq = resultSeq :+ "FizzBuzz"}
      else if(element % 3 == 0){ resultSeq = resultSeq :+ "Fizz"}
      else if (element % 5 == 0){resultSeq = resultSeq :+ "Buzz"}
      else resultSeq = resultSeq :+ element.toString
    })

    resultSeq
  }
}

object Main extends App {

  // Getting input from the users
  print("Enter values with a space => ")
  val userInput = readLine()
  
  /**
    * @brief - Validate the user input and give the desired result if the input is correct
    * @param input - input provided by the user - String
    * @return result - FizzBuzz game array - Seq[String]
    */
  def validateAndResult(input: String): Seq[String] = {

    // Splitting the input in an array
    var inputSequence = Seq[String]()
    inputSequence = input.trim.split(" +")

    // Validating the input is correct and giving the correct answer
    try{
      var intInputSequence = Seq[Int]()
      intInputSequence = inputSequence.map(_.toInt)
      var result = Seq[String]()
      result = FizzBuzz.result(intInputSequence)
      result
    } catch {
      case ex: Exception => {
        println("Values are of not correct type, please give correct numbers with a space.")
        return Seq[String]()
      }
    }
  }

  // Printing out the result
  println(validateAndResult(userInput))

}