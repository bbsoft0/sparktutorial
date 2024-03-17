## Spark

Spark Scala program for processing taxi trips in New York City.
Data was downloaded from :
https://www.nyc.gov/site/tlc/about/tlc-trip-record-data.page?source=post_page-----80e2680d3528--------------------------------

 the Yellow Taxi Trip records for October 2023
 
The code contains a function to find the average tip amount for each pickup location (PULocationID). 
In addition to returning the data, the code also displays the pickup locations that have the highest average tip amount. 
All that is left is reading the data, calling this function to do the analysis, and writing the data to an output location. 
The path to data and output locations are provided by command line arguments.

Spark local mode allows Spark programs to run on a single machine, using the Spark dependencies (spark-core and spark-sql) included in the project. 
The local mode uses resources of the machine it is running on, and runs all the tasks in the Driver process.
