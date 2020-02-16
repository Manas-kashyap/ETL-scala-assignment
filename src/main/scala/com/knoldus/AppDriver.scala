

package com.knoldus

import java.io.File

object AppDriver extends App {
  val capitalizeInFiles = new CapitalFile("/home/knoldus/workspace/project")
  val listOfFiles: List[File] = capitalizeInFiles.getFiles
  println(capitalizeInFiles.capitalizingContent(listOfFiles, "/home/knoldus/workspace", List.empty[String]))
  val wordCount = new WordCount
  println(wordCount.countWords("/home/knoldus/workspace/project/File1"))
}
