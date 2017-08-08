name := "SeBiFly"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies += "org.apache.spark" % "spark-core_2.11" % "2.1.0"
libraryDependencies += "org.apache.spark" % "spark-sql_2.11" % "2.1.0"

libraryDependencies += "org.apache.jena" % "jena-core" % "3.1.1"
libraryDependencies += "org.apache.jena" % "jena-arq" % "3.1.1"

libraryDependencies += "com.google.guava" % "guava" % "22.0"

libraryDependencies += "com.typesafe.play" % "play_2.11" % "2.6.2"

// NOTE: the suffix should match with scala version used
libraryDependencies += "com.datastax.spark" % "spark-cassandra-connector_2.11" % "2.0.0"

libraryDependencies += "org.mongodb.spark" %% "mongo-spark-connector" % "2.1.0"

dependencyOverrides ++= Set("com.fasterxml.jackson.core" % "jackson-databind" % "2.6.5")