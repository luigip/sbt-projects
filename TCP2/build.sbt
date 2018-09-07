name := "TCP2"

version := "0.0"

scalaVersion := "2.9.1"

libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "1.6.1" % "test")

testOptions in Test += Tests.Argument ("-oD")