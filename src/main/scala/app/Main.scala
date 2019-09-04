package app

import java.util

import jep.Jep
import jep.python.PyObject

object Main extends App {
  val jep = new Jep()

  def comp(module: String, name: String) = {
    import scala.jdk.CollectionConverters._
    jep.eval(s"from $module import $name")
    jep.getValue("DT.cs().serialize()")
  }

  val dt = comp("paje.ml.element.modelling.supervised.classifier.dt", "DT")
  println("[[" + dt + "]]")
//  println("[[" + dt("criterion")("a") + "]]")
  println("[[" + dt.getClass + "]]")

  jep.runScript("src/main/python/demo.py")
  print(jep.getValue("asd"))
}
