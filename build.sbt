// Project

name := "Project Name"

organization := "Organization Name"

version := "1.0"


// SBT

scalaSource in Compile <<= baseDirectory / "app"

scalaSource in Test <<= baseDirectory / "specs"

seq(com.github.retronym.SbtOneJar.oneJarSettings: _*)


// Scala

scalaVersion := "2.9.2"

scalacOptions ++= Seq("-deprecation", "-unchecked")


// Managed libraries

//resolvers ++= Seq()

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "1.7.2" % "test"
)
