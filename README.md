# Scala Archetype For Maven With ScalaTest Support

This is a simple archetype for creating [Scala][1] projects in
[Maven][2]. It is an extension of [scala-archetype-simple][3] with
configuration suitable for testing out-of-the-box with [ScalaTest][4].

## Prerequisites

This archetype is designed to be used with Maven 3.x. You can run `mvn
-version` to make sure you have a compatible version.

## Installing the archetype

To install this archetype and use it locally, clone this Git repo, and
from a command line in the project directory, run:

    mvn install

Then, when you want to use the archetype, do this:

    mvn archetype:generate -DarchetypeCatalog=local

This archetype should appear in a list. Enter the number associated
with it, and you're on your way.

## Integrating ScalaTest Tests

This archetype is configured to work in conjunction with
`org.scalatest.junit.JUnitRunner` and JUnit 4. Make sure your test
suites and specs are decorated with:

    import org.scalatest.junit.JUnitRunner
    import org.junit.runner.RunWith
    
    @RunWith(classOf[JUnitRunner])

## Running ScalaTest Tests

This archetype is configured to automatically discover files ending in
`Test.scala` or `Spec.scala` in the project directory
`src/test/scala`. To run tests, simply do:

    mvn test

[1]: http://www.scala-lang.org/
[2]: http://maven.apache.org/
[3]: http://scala-tools.org/repo-releases/org/scala-tools/archetypes/scala-archetype-simple/
[4]: http://www.scalatest.org/
