import sbt._
import de.element34.sbteclipsify._

class LiftProject(info: ProjectInfo) extends DefaultWebProject(info) with Eclipsify {
    val ivyLocal = "Local Ivy Repository" at "file://"+Path.userHome+"/.ivy2/local"
    val mavenLocal = "Local Maven Repository" at "file://"+Path.userHome+"/.m2/repository"
    val databinder = "Databinder Repository" at "http://databinder.net/repo"
    val scalatools_snapshot = "Scala Tools Snapshot" at "http://scala-tools.org/repo-snapshots/"
    val scalatools_release = "Scala Tools Snapshot" at "http://scala-tools.org/repo-releases/"

    val liftVersion = "2.3-SNAPSHOT"

    override def libraryDependencies = Set(
        "net.liftweb" %% "lift-webkit" % liftVersion % "compile->default",
        "net.liftweb" %% "lift-squeryl-record" % liftVersion,
        "joda-time" % "joda-time" % "1.6",
        "org.mortbay.jetty" % "jetty" % "6.1.22" % "test->default",
        "com.h2database" % "h2" % "1.2.121",
        
        "log4j" % "log4j" % "1.2.16",
	"org.slf4j" % "slf4j-log4j12" % "1.6.1"
    ) ++ super.libraryDependencies
}
