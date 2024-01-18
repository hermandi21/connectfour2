//case class
case class Zelle(value:Int){
  def isSet:Boolean = value != 0
}

val zelle1 = Zelle(2)
val zelle2 = Zelle(3)

zelle1.isSet // true
!(zelle2.isSet) // das ist false wegen '!'

//Interface
trait car{
  def checkIfProtective():Any

  def haveFourWheels(): Any={
    println("Yes, ofc")
  }
}


val add = (x:Int, y: Int) => x + y
println(add(2,3))

def add(x:Any, y:Any): Any = { x + y }

println(add(3,4))

def addThenMultiply(x: Int, y: Int)(muliplier: Int): Int = {
  (x+y) * muliplier
}
println(addThenMultiply(5,5)(2))

class Gruessen(prefix: String, suffix: String):
  def gruesse(name: String): Unit = {
    println(prefix + name + suffix)
  }

val gruss = Gruessen("Hallo: ", "!!!")
gruss.gruesse("Mistaa Kessler")

case class Point(x: Int, y: Int)

val point = Point(2,3)
val anotherPoint = Point(10,2)
val thirdPoint = Point(4,8)

if point != anotherPoint then
  println(s"$point and $anotherPoint aren't the same")
else
  println(s"$point and $anotherPoint are the same")


object IDFactory:
  private var counter = 0
  def create: Int = {
    counter += 1
    counter
  }

val newID: Int = IDFactory.create
println(newID)

val ndID: Int = IDFactory.create
println(ndID)

trait Greeter:
  def gruessen(name: String): Unit =
    println("Hello, " + name + "!")

class DefaultGreeter extends Greeter

class CustomizableGreeter(prefix: String, postfix: String) extends Greeter:
  override def gruessen(name: String): Unit =
    println(prefix + name + postfix)

  val greeter = DefaultGreeter()
  greeter.gruessen(" Ja Sicha biste deppert ")

  val customGreeter = CustomizableGreeter("How are you? ", "!!!")
  customGreeter.gruessen("Mothafucking Scala Developer")

@main def hello() = println("Hello, Scala developer!")