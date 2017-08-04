name := "fucc"

version := "0.0.1"

scalaVersion := "2.12.3"

libraryDependencies ++= Seq("org.typelevel" %% "cats" % "0.9.0",
  "com.chuusai" %% "shapeless" % "2.3.2",
  "org.typelevel" %% "cats-effect" % "0.4",
  "commons-codec" % "commons-codec" % "1.10",
  "com.softwaremill.common" %% "tagging" % "2.1.0"
)

  scalacOptions := Seq(
  "-unchecked",
  "-feature",
  "-deprecation",
  "-encoding",
  "utf8",
  "-Ypartial-unification",
  "-language:higherKinds"
)