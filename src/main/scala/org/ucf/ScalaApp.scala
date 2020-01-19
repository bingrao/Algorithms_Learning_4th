package org.ucf

/**
  * @author 
  */
object ScalaApp {
  val log = new org.ucf.utils.Log(this.getClass.getName)
  def printHello() =  log.info("Hello World from Scala")
  def main(args: Array[String]): Unit = {
    printHello()
  }
}