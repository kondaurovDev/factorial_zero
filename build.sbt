scalaVersion in Global := "2.12.4"

lazy val factorial_zero = (project in file("."))
  .settings(
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.0.5" % "test"
    )
  )