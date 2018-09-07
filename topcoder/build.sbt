name := "Topcoder"

version := "1.0"

scalaVersion := "2.10.6"

libraryDependencies ++= Seq(
  "junit" % "junit" % "4.7" % "test",
  // To prevent a warning regarding different dependency versions:
  "org.scala-lang" % "scala-reflect" % "2.10.6",
  "org.scalatest" %% "scalatest" % "1.9.1" % "test"
)

// This allows for timing to be shown:
testOptions in Test += Tests.Argument ("-oD")
