package model

import io.AnsiColor.*
import scala.math.*
class Playground (val size:Int){
  override def toString: String = {
    val lineex = "%s  %s%s%s|  %s\n".format(BLUE_B, (s"${BLUE_B}|${YELLOW_B}   ${RESET}") * (size.toFloat / 2).toInt, (s"${BLUE_B}|${RED_B}   ${RESET}") * ceil(size.toFloat / 2).toInt, BLUE_B, RESET)
    val box = colnames() + line() * size + lineex + border()
    return box
  }

  def colnames(): String = {
    val cols = for {
      n <- 1 to size
    } yield n
    return s"${BLUE_B}\t" + cols.mkString("\t") + s"\t ${RESET}\n"
  }

  def line(): String = {
    return s"${BLUE_B}  " + ("|   " * size) + s"|  ${RESET}\n"
  }

  def border(): String = {
    return s"${BLUE_B}  " + ("----" * size) + s"-  ${RESET}\n"
  }
}
