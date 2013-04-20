import AssemblyKeys._

assemblySettings


// Project

name := "Project Name"

organization := "Organization Name"

version := "1.0"


// SBT

scalaSource in Compile <<= baseDirectory / "src"

scalaSource in Test <<= baseDirectory / "test"


// Scala

scalaVersion := "2.10.1"

scalacOptions ++= Seq("-deprecation", "-unchecked")


// Managed libraries

//resolvers ++= Seq()

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "1.9.1" % "test"
)
