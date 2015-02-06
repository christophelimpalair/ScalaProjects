#Scala WordCount

This project counts words on a local machine (if args(0) is not provided), or any other machine (AWS, etc...). If args(1) is not provided, it will use a List of hard coded words, otherwise it will read in whatever file at the path you provide. 

It will count each word occurence splitting empty spaces (keep in mind commas, periods, etc.. will be attached to a word)

After the words are counted, they will be sorted by most occurence.

Original wordcount code from: https://raw.githubusercontent.com/databricks/learning-spark/master/src/main/scala/com/oreilly/learningsparkexamples/scala/WordCount.scala

Modified by Christophe Limpalair
