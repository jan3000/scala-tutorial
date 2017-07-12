package fileSearcher

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

}
