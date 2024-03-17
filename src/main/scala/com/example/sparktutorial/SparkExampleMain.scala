package com.example.sparktutorial

import com.example.sparktutorial.Analysis.calculateAverageTipByPickupLocation

object SparkExampleMain extends App {
    val spark = createSparkSession("Spark test", isLocal = true)

    val inputPath = "data"
    val outputPath = "output"
    //val (inputPath, outputPath) = parseArgs(args = args)
    val data = spark.read.parquet(s"${inputPath}/*.parquet")

    val analysisResult = calculateAverageTipByPickupLocation(data = data)

    analysisResult.write.option("header", "true").mode("overwrite").csv(outputPath)
}