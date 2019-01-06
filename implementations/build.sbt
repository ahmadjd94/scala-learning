name := "implementations"

version := "1.0"

lazy val `implementations` = project in file(".")

//resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"
//
//resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"

//scalaVersion := "2.12.8"


organization := "poc-implementations"

libraryDependencies ++= Seq(
  "poc-parents" %% "parents" % "1.0"
)