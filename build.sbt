name := "app"

version := "1.0"

lazy val `app` = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq( jdbc , cache , ws   , specs2 % Test )

//libraryDependencies += "org.slf4j" % "slf4j-simple" % "1.6.4"

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play-slick" % "1.1.1"
  )

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"  