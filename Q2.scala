package Demo8
object Q2 extends App{


  val inputInteger = 5

  def category(inputInteger:Int):String = inputInteger match{
    case x if x<0 => "Negative"
    case x if x==0 => "Zero"
    case x if x>0 && x%2 == 0 => "Positive and Even"
    case _ => "Positive and Odd"
  }

  println(category(inputInteger))


}
