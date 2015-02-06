/**
 * Created by Christf on 2/5/2015.
 */
package com.test

import scala.io.Source


object Testing {
  def main(args: Array[String]) {
    if (args.length > 0 )
    {
      for ( line <- Source.fromFile(args(0)).getLines())
        println(line.length +", "+ line)
    }
    else
      Console.err.println("Please enter filename")
  }
}
