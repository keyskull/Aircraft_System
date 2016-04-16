package cn.aircraft

import akka.actor.Actor
import akka.event.Logging

class Aircraftsystem extends Actor{
  import cn.aircraft.Aircraftsystem._
  val log = Logging(context.system, this)
    def receive = {
    case Init => log.info("Aircraft system Initializing")
    println("")
    case Start => log.info("received unknown message")
    case _ => 
  }
}

object Aircraftsystem{
  case class Init()
  case class Start()
  case class Stop()
}