Global / onChangedBuildSource := ReloadOnSourceChanges
ThisBuild / organization := "ttg"
ThisBuild / description := "bloop-watch"
ThisBuild / licenses += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html"))

lazy val bintraySettings = Seq(
  bintrayOrganization in bintray := None,
  bintrayReleaseOnPublish := false,
  bintrayPackageLabels := Seq("sbt", "scala", "bloop"),
  bintrayVcsUrl := Some("git:git@github.com:aappddeevv/bloop-watch"),
)

lazy val root = (project in file("."))
  .settings(
    sbtPlugin := true,
    name := "bloop-watch",
  )
  .settings(bintraySettings)
  .settings(scalacOptions ++= Seq("-language:_", "-deprecation"),
	libraryDependencies ++= Seq(
"ch.epfl.scala" %% "bloop-config" % "1.4.0-RC1-76-1488031d"

))
  .enablePlugins(GraalVMNativeImagePlugin)

