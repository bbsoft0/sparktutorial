
package com.example.sparktutorial

import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.functions.{avg, col, count, lit}


object Analysis {
  def calculateAverageTipByPickupLocation(data: DataFrame): DataFrame = {
    val result = data
      .groupBy("PULocationID")
      .agg(
        avg("tip_amount"),
        count(lit(1)).as("num_rows")
      )

    result.sort(col("num_rows").desc).show(truncate = false, numRows = 10)
    result
  }
}