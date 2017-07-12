package fileSearcher


import java.io.File

import fileSearch.{DirectoryObject, FileObject, FilterChecker}
import org.scalatest.FlatSpec

/**
  * Created by jan on 08.07.2017.
  */
class FilterCheckerTests extends FlatSpec {

  "FilterChecker passed a list where one file matches the filter" should
    "return a list with that filter" in {
    val matchingFile = new FileObject(new File("match"))
    val listOfFiles = List(new FileObject(new File("random")), matchingFile)
    val matchedFiles = new FilterChecker("match").findMatchedFiles(listOfFiles)

    assert(matchedFiles == List(matchingFile))
  }


  "FilterChecker passed a list with a directory that matches the filter" should
    "not return the directory" in {

    val listOfIOObjects = List(new FileObject(new File("random")), new DirectoryObject(new File("match")))
    val matchedFiles = new FilterChecker("match").findMatchedFiles(listOfIOObjects)

    assert(matchedFiles.isEmpty)
  }

}
