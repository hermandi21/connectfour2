@main def hello: Unit =
  println("Hello world!")
  println(msg)

  println("Wir erzeugen keinen Merge Konflikt")


def msg = "I was compiled by Scala 3. :)"

