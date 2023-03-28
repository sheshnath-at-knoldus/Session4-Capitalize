package com.knoldus
import scala.util.{Failure, Success, Try}

//class Capitalize
class Capitalize {
//method
  def capitalizeChar(listOfString: List[String], charToCapitalize: Char): List[String] = {
    Try {
      if (listOfString.isEmpty) throw new NullPointerException()
      val afterCapitalize = listOfString.map(stringValue => stringValue.map(char => if (char == charToCapitalize) char.toUpper else char))
      afterCapitalize
    }
  } match {
    case Success(afterCapitalize) => afterCapitalize
    case Failure(exception) => List(exception.getMessage)
  }
}



