organization := "com.verknowsys"

name := "funlet-example"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.9.0-1"

seq(webSettings:_*)

resolvers += "VerKnowSys Repository" at "http://repo.verknowsys.com"

libraryDependencies ++= Seq(
    "com.verknowsys" %% "funlet" % "0.1.0-SNAPSHOT",
    "org.eclipse.jetty" % "jetty-webapp" % "7.4.1.v20110513" % "jetty"
)
