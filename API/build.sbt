name := "api"

version := "1.0"

lazy val `api` = project in file(".")

//resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"
//
//resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"

//scalaVersion := "2.12.8"


libraryDependencies ++= Seq(
  "poc-implementations" %% "implementations" % "1.0"
)