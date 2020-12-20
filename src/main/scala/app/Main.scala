package app

import java.util

import jep.Jep
import jep.python.PyObject

object Main extends App {
  val jep = new Jep()

  def comp(module: String, name: String) = {
    import scala.jdk.CollectionConverters._
    jep.eval(s"from $module import $name")
    jep.getValue("Class.cs().serialize()")
  }

  val obj = comp("package.module", "Class")
  println("[[" + obj + "]]")
  println("[[" + obj.getClass + "]]")

  jep.runScript("src/main/python/demo.py")
  print(jep.getValue("asd"))
}
