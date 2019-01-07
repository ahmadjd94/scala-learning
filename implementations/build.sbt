version := "1.0.0"

val parents = "poc.parents" % "parents_2.12" % "1.0.0"

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"

resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"


lazy val `implementations` = (project in file("."))
  .settings(
    name := "implementations",
    scalaVersion := "2.12.8",
    organization := "poc.implementations",
    libraryDependencies += parents,

  )