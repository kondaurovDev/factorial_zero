package factorial_zero

import org.scalatest.Matchers

class FactorialServiceSpec extends org.scalatest.FlatSpec with Matchers {

  "countZero for 100" should "return 24" in {

    FactorialService.countZero(100) shouldBe 24

  }

  "countZero for 1000" should "return 249" in {

    FactorialService.countZero(1000) shouldBe 249

  }

  "calculate factorial for 5" should "return 120" in {

    FactorialService.calculateFactorial(5) shouldBe 120

  }

  "calculate factorial for 25" should "return 1" in {

    FactorialService.calculateFactorial(5) shouldBe 120

  }

}
