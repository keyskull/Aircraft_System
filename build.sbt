name := "Aircraft_System"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++=List(
  "com.typesafe.akka" %% "akka-actor" % "2.4.4",
  "com.typesafe.akka" %% "akka-remote" % "2.4.4",
  "com.typesafe.akka" %% "akka-typed-experimental" % "2.4.4",
  "net.java.dev.jna" % "jna" % "4.2.2",
  "net.java.dev.jna" % "jna-platform" % "4.2.2"
)