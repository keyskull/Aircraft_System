package cn.aircraft

import akka.actor.Actor
import akka.event.Logging
 
object NetworkActor{
  case object Client
  case object Server
}
class NetworkActor extends Actor {
  val log = Logging(context.system, this)
  def receive = {
    case "test" => log.info("received test")
    case _      => log.info("received unknown message")
  }
}

object HelloWorld {
  import akka.typed._
  import akka.typed.ScalaDSL._
  final case class Greet(whom: String, replyTo: ActorRef[Greeted])
  final case class Greeted(whom: String)
 
  val greeter = Static[Greet] { msg ⇒
    println(s"Hello ${msg.whom}!")
    msg.replyTo ! Greeted(msg.whom)
  }
}