lazy val root = (project in file(".")).
  settings(
    name := "scalaget",
    version := "1.0",
    scalaVersion := "2.11.5",
    libraryDependencies ++= Seq(
      "org.jsoup" % "jsoup" % "1.8.1"
    )
  ).dependsOn(curly)

lazy val curly = uri("https://git.mayreh.com/git/ocadaruma/curly.git#develop")
