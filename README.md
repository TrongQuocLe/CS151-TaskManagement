# CS151 - Task Management
Task Management built with the springboot framework 

## Overview:
This is an overview holder of overview

## Purpose:
This is a purpose holder of purpose    

## Resources
* Data Source: (amazon_reviews_us_Electronics_v1_00.tsv.gz)
[Link to Data Source](https://s3.amazonaws.com/amazon-reviews-pds/tsv/amazon_reviews_us_Electronics_v1_00.tsv.gz)
* Software: 
PostgreSQL 11, 
Google Colaboratory,
Spark Version: http://www.apache.org/dist/spark/$SPARK_VERSION/$SPARK_VERSION-bin-hadoop2.7.tgz


## Analysis:
### Overview of Analysis:
When manipulating and using big data an ETL pipeline is a must have. In this analysis there is about a 2Gb .tsv file of reviews with many columns. With too much data to look at it is much harder to perform an analysis. This is where the ETL process comes in. First, we Extract the data from the S3 bucket, then we transform the data by cleaning and separating the data into bite size tables to do our analysis, and finally we load the tables into a database so we can do further analysis and share our findings.   

### Results:
The results can be seen in the .ipynb files. Unlike extracting data from multiple sources and from different sources, we only had one source of data to work with. With smaller data we can expect our data set to need a lot more cleaning, this data set of reviews however was a big file but didn't need as much cleaning. The idea here was more so to separate the data into smaller tables to create relations between them and do our analysis this way. For best practice, it is always good to have a customer’s table with the customers id and a products table with products id. From these two main tables we can create a relation with the review table. 

See below for the tables created through the transformation process:

![Customers_table](https://github.com/lo7kyle/Amazon_Vine_Analysis/blob/main/Resources/customers_table.PNG) 

![Product_Table](https://github.com/lo7kyle/Amazon_Vine_Analysis/blob/main/Resources/product_table.PNG) 

![Vine_Table](https://github.com/lo7kyle/Amazon_Vine_Analysis/blob/main/Resources/vine_table.PNG) 

From our analysis we wanted to know if the paid Vine Reviews program had any bias in their reviews, meaning the paid reviews had higher ratings than that of unpaid reviews. For this analysis I only looked at 5-star reviews. We can also make a case for 4-star reviews because someone is more likely to give a 4-star review instead of a 5 star review. The results I can honestly say wasn't surprising, but this showed that there isn't any bias in paid reviews. We see that there are more unpaid reviews than the paid reviews. Looking below we also see that there is a lower 5-star percentage from the paid vine reviews than the unpaid. I can assume that this is due to the process of having someone reach out to the customer for review will give a more honest opinion on the product than someone who is reviewing the product on their own.  

![Vine_Analysis](https://github.com/lo7kyle/Amazon_Vine_Analysis/blob/main/Resources/vine_analysis.PNG) 

There are many analyses we can do on these reviews such as sentiment analysis or even screening for bots, but for a quick way to perform an analysis for bias quick math is always a good way to start. 

### Summary:
This is a summary holder 
