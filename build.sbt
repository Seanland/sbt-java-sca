name := "BasicProjectWithScalaTest"

version := "1.0"

scalaVersion := "2.10.0"

libraryDependencies ++= Seq(
    "net.sourceforge.htmlcleaner" % "htmlcleaner" % "2.4",
    "org.apache.logging.log4j" % "log4j-core" % "2.14.1",
    "org.apache.struts" % "struts2-core" % "2.3.20",
    "commons-fileupload" % "commons-fileupload" % "1.3.1",
    "org.apache.struts.xwork" % "xwork-core" % "2.3.20",
    "org.springframework" % "spring-core" % "3.2.6.RELEASE",
    "org.foobar" %% "foobar" % "1.8"
)