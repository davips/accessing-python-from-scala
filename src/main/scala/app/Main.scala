package app

import jep.Jep

object Main extends App {
  val jep = new Jep()
  jep.eval("s = 'Hello World'")
  jep.eval("print(s)")
  val java_string = jep.getValue("s").toString
  println("Java String:" + java_string)
  jep.runScript("src/main/python/demo.py")
  print(jep.getValue("asd"))
}
