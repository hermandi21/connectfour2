package de.htwg.se.connectfour

import model.{Player, Playground}
//import de.htwg.se.aview.Tui

import scala.io.StdIn.readLine

object ConnectFour {

  def main(args: Array[String]): Unit = {
    print("Player 1, please enter your name: ")
    val player1 = Player(readLine())
    print("Player 2, please enter your name: ")
    val player2 = Player(readLine())

    println("Welcome to Connect Four!" + "\n" + player1.name + " and " + player2.name)

    val playground = Playground(7)
    println(playground)
  }

}