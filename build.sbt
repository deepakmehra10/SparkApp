name := "Spark"

version := "1.0"

scalaVersion := "2.11.8"

// spark 1.6.1
libraryDependencies += "org.apache.spark" %% "spark-core" % "1.6.1"

libraryDependencies += "org.apache.spark" %% "spark-sql" % "1.6.1"

libraryDependencies += "com.databricks" % "spark-csv_2.11" % "1.5.0"
