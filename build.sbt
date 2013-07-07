name := "shrubb"

version := "0.0.1"

scalaVersion := "2.9.1"

description := "Simple Scala wrapper around the Forrst API (v2)"

libraryDependencies ++= Seq(
    "com.ning" % "async-http-client" % "1.7.9",
    "commons-collections" % "commons-collections" % "3.2.1",
    "org.apache.commons" % "commons-lang3" % "3.1",
    "com.google.guava" % "guava" % "12.0",
    "org.codehaus.jackson" % "jackson-core-asl" % "1.9.5",
    "org.codehaus.jackson" % "jackson-mapper-asl" % "1.9.5",
    "org.json" % "json" % "20090211",
    "junit" % "junit" % "4.9",
    "org.slf4j" % "slf4j-api" % "1.7.2",
    "org.testng" % "testng" % "6.7",
    "javax.validation" % "validation-api" % "1.0.0.GA"
)