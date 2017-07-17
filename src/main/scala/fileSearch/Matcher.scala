package fileSearch

import java.io.File
import java.nio.file.Paths

/**
  * Created by jan on 11.07.2017.
  */
class Matcher(filter : String, val rootLocation : String = new File(".").getCanonicalPath) {

  val rootToIOObject = FileConverter.convertToIOObject(Paths.get(rootLocation).toFile)

  def execute() = {
    val matchingFiles = rootToIOObject match {
      case file: FileObject if FilterChecker(filter) matches file.name => List(file)
      case directoy: DirectoryObject => FilterChecker(filter) findMatchedFiles(directoy.children())
      case _ => List()

    }

    matchingFiles.map(_.name)
  }

}
