name := "BasicProjectWithScalaTest"

version := "1.0"

scalaVersion := "2.10.0"

libraryDependencies ++= Seq(
    "net.sourceforge.htmlcleaner" % "htmlcleaner" % "2.4",
    "org.scalatest" % "scalatest_2.10" % "1.9.1" % "test",
    "org.foobar" %% "foobar" % "1.8"
)