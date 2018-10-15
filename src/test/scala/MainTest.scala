import org.scalatest.FunSuite

class FizzBuzzTest extends FunSuite {

    test("Simple Input") {
        val userInput = "3 7 14 2 4"
        assert(Main.validateAndResult(userInput) == Seq[String]("Fizz", "7", "14", "2", "4"))
    }

    test("Extra space at the end") {
        val userInput = "3 7 14 2 4 "
        assert(Main.validateAndResult(userInput) == Seq[String]("Fizz", "7", "14", "2", "4"))
    }

    test("Extra space at the start") {
        val userInput = " 3 7 14 2 4"
        assert(Main.validateAndResult(userInput) == Seq[String]("Fizz", "7", "14", "2", "4"))
    }

    test("Extra space at the start and end") {
        val userInput = " 3 7 14 2 4 "
        assert(Main.validateAndResult(userInput) == Seq[String]("Fizz", "7", "14", "2", "4"))
    }

    test("No Element") {
        val userInput = ""
        assert(Main.validateAndResult(userInput) == Seq[String]())
    }

    test("Just spaces") {
        val userInput = "  "
        assert(Main.validateAndResult(userInput) == Seq[String]())
    }

    test("Unusual Input 01") {
        val userInput = "1,12,324,43 43 2"
        assert(Main.validateAndResult(userInput) == Seq[String]())
    }

    test("Unusual Input 02 - at the start") {
        val userInput = ",1,12,324,43 43 2"
        assert(Main.validateAndResult(userInput) == Seq[String]())
    }

    test("Unusual Input 03 - at the end") {
        val userInput = "1,12,324,43 43 2,"
        assert(Main.validateAndResult(userInput) == Seq[String]())
    }

    test("Unusual Input 04 - at the start and at the end") {
        val userInput = ",1,12,324,43 43 2,"
        assert(Main.validateAndResult(userInput) == Seq[String]())
    }

    test("Unusual Input 05") {
        val userInput = ","
        assert(Main.validateAndResult(userInput) == Seq[String]())
    }

    test("Unusual Input 06") {
        val userInput = ", , []"
        assert(Main.validateAndResult(userInput) == Seq[String]())
    }
    
}
