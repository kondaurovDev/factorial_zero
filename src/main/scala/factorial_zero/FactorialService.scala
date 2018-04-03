package factorial_zero

import math.pow
import scala.annotation.tailrec

object FactorialService {

  def calculateFactorial(n: Long): BigInt = {
    List.range(1, n).foldLeft(1L)((acc, curr) => acc + acc * curr)
  }

  @tailrec
  def countZeroRecursive(n: Long, power: Int, acc: Long): Long = {

    val res = n / pow(5, power).toInt

    if (res <= 1) {
      res + acc
    } else {
      countZeroRecursive(n, power + 1, res + acc)
    }

  }

  /**
    * Посчитать количество нулей в конце факториала
    * @param n от какого числа брать факториал
    * @return сколько нулей в результате
    */
  def countZero(n: Long): Long = {

    countZeroRecursive(n, 1, 0)

  }

}
