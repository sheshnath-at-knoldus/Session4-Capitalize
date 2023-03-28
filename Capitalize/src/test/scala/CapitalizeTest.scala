package com.knoldus

import org.scalatest.funsuite.AnyFunSuite

class CapitalizeTest extends AnyFunSuite{

  test("Capitalize Test") {
    val instanceOfCapitalize = new Capitalize
    val actualResult = instanceOfCapitalize.capitalizeChar(List("My","Name","is","Sheshnath"),'s')
    val expectedValue = List("My","Name","iS","SheShnath")
    assert(actualResult===expectedValue)
  }

  test("Capitalize Test for Empty List") {
    val instanceOfCapitalize = new Capitalize
    val actualResult = instanceOfCapitalize.capitalizeChar(List(), 's')
    val expectedValue = List(null)
    assert(actualResult === expectedValue)
  }

}
