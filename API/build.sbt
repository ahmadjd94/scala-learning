ThisBuild / name := "api"

ThisBuild / version := "1.0"

val parents = "poc.parents" % "parents_2.12" % "1.0.0"
val implementations = "poc.implementations" % "implementations_2.12" % "1.0.0"

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"

resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"
//
ThisBuild / scalaVersion := "2.12.8"

ThisBuild / organization := "poc.api"




lazy val api = (project in file("."))
  .settings(
    name := "api",
    scalaVersion := "2.12.8",
    libraryDependencies ++= Seq(parents ,implementations)
  )