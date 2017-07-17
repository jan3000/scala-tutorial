package fileSearch

/**
  * Created by jan on 08.07.2017.
  */
class FilterChecker(filter : String) {

  def matches(content: String) = content contains filter

  def findMatchedFiles(listOfFiles: List[IOObject]): List[IOObject] = {
    listOfFiles
      .filter(_.name.contains(filter))
      .filter(_.isInstanceOf[FileObject])
  }


}

object FilterChecker{
  def apply(filter: String): FilterChecker = new FilterChecker(filter)
}