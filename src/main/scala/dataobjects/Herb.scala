package dataobjects

/**
  * Created by sujatha on 9/6/16.
  */
case class Herb(name: String, isMedicinal: Boolean) {
//  var name1 = name
//  var isMedicinal1 = isMedicinal
//
//  override def toString:String={
//    name1
//  }
}

object Herb {

  val herbList = List(
    new Herb("Rosemary", true),
    new Herb("Lavendar", true),
    new Herb("Basil", false),
   new Herb("Cilantro", false))

  def main(args: Array[String]) {
    println(Herb.herbList)
  }

}
