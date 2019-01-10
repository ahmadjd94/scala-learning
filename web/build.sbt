//name := """web"""
//organization := "com.api"
//
//version := "1.0-SNAPSHOT"
//
//lazy val root = (project in file(".")).enablePlugins(PlayScala)
//
//scalaVersion := "2.12.8"
//
//libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test
//
//// Adds additional packages into Twirl
////TwirlKeys.templateImports += "com.api.controllers._"
//
//// Adds additional packages into conf/routes
//// play.sbt.routes.RoutesKeys.routesImport += "com.api.binders._"

val scalaPlay = "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test

val parents = "poc.parents" % "parents_2.12" % "1.0.0"
val implementations = "poc.implementations" % "implementations_2.12" % "1.0.0"
//val guice = "com.google.inject" % "guice" % "4.2.2"


libraryDependencies += guice

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.6.20")
//libraryDependencies += guice

resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"
resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"


ThisBuild / version := "1.0"

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"

scalaVersion := "2.12.8"
organization := "poc.web"

logLevel := Level.Warn


lazy val web = (project in file(".")).settings(
  name := "web",
  scalaVersion := "2.12.8",
  libraryDependencies ++= Seq(guice, parents ,implementations)
).enablePlugins(PlayScala)
