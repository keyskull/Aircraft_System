package cn.aircraft.Controller

import akka.actor.Actor
import akka.actor.ActorLogging

object Aircraft{
  case object Connect

}

class Aircraft extends Actor with ActorLogging {
   def receive = {
    case Aircraft.Connect => log.info("received test")
    case _ => 
  }
}

