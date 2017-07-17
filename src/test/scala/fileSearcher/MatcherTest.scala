package fileSearcher

import java.io.File

import fileSearch.Matcher
import org.scalatest.FlatSpec

/**
  * Created by jan on 11.07.2017.
  */
class MatcherTest extends FlatSpec {

  "Matcher that is passed a file matching the filter" should
  "return a list with that file name" in {

    val matcher = new Matcher("fake", "fakePath")
    val result = matcher.execute()
    assert(result == List("fakePath"))
  }

  "Matcher using a directory containing one file matching the filter" should
  "return a list with that file name" in {
    val matcher = new Matcher("txt", new File(".\\testfile\\").getCanonicalPath)
    val results  = matcher.execute()

    assert(results == List("readme.txt"))
  }

  "Matcher that is not passed a root file location" should
  "use the current location" in {
    val matcher = new Matcher("filter")

    assert(matcher.rootLocation == new File(".").getCanonicalPath)
  }


}
