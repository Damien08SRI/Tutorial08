package Demo8
package scala.math

object Q1 extends App{

  val deposit = 200000
  def interest(deposit:Double):Double = deposit match{
    case x if x <= 20000 => x*0.02
    case x if x <= 200000 => x*0.04
    case x if x <= 2000000 => deposit*3.5
    case _ => deposit*0.065

  }

  val findInterest = interest(deposit)

  println(s"The interest earned on Rs. $deposit is Rs.$findInterest")

}
