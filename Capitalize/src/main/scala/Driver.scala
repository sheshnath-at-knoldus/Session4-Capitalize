package com.knoldus

import scala.util.{Failure, Success, Try}

object Driver extends App {

  val list = List("My","name","is","Sheshnath")
  //instance of class
  val capitalizeInstance = new Capitalize
  val result = capitalizeInstance.capitalizeChar(list, 'a')
  print(result)

}
