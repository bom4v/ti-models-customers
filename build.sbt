name := "ti-models-customers"

organization := "org.bom4v.ti"

organizationName := "Business Object Models for Verticals (BOM4V)"

organizationHomepage := Some(url("http://github.com/bom4v"))

version := "0.0.1"

homepage := Some(url("https://github.com/bom4v/ti-models-customers"))

startYear := Some(2019)

description := "Business-related object and classes modelling telecom/transport customers and associated profiles"

licenses += "Apache-2.0" -> url("https://www.apache.org/licenses/LICENSE-2.0")

scmInfo := Some(
  ScmInfo(
    url("https://github.com/bom4v/ti-models-customers"),
    "https://github.com/bom4v/ti-models-customers.git"
  )
)

developers := List(
  Developer(
    id    = "denis.arnaud",
    name  = "Denis Arnaud",
    email = "denis.arnaud_ossrh@m4x.org",
    url   = url("https://github.com/denisarnaud")
  )
)

//useGpg := true

scalaVersion := "2.11.8"

crossScalaVersions := Seq("2.11.8", "2.11.12")

checksums in update := Nil

libraryDependencies += "com.github.nscala-time" %% "nscala-time" % "2.22.0"

libraryDependencies += "org.specs2" %% "specs2-core" % "4.4.1" % "test"

javacOptions in Compile ++= Seq("-source", "1.8",  "-target", "1.8")

scalacOptions ++= Seq("-deprecation", "-feature")

pomIncludeRepository := { _ => false }

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value) Some("snapshots" at nexus + "content/repositories/snapshots")
  else Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

publishMavenStyle := true

cleanKeepFiles += target.value / "test-reports"

