package cn.aircraft


import com.sun.jna.Native
import com.sun.jna.Library
import com.sun.jna.Platform



trait CLibrary extends Library { 
def puts(s: String) 
} 

object library { 
def system = Native.loadLibrary( 
if (Platform.isWindows) "msvcrt" else "c", 
classOf[CLibrary]).asInstanceOf[CLibrary] 
def aircraft = Native.loadLibrary("libaircraft",classOf[CLibrary]).asInstanceOf[CLibrary] 
} 

object main {
  import akka.actor.ActorSystem
  import akka.actor.Props
    def main(args: Array[String]):Unit={
      library.system.puts("Hello, World") 
      library.aircraft
      val system = ActorSystem("aircraftsystem")
      system.actorOf(Props(classOf[Aircraftsystem]),"Header")
     
    }
}

