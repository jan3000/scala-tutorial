package fileSearch

import java.io.File
import java.nio.file.Paths

/**
  * Created by jan on 11.07.2017.
  */
class Matcher(filter : String, rootLocation : String) {

  val rootToIOObject = FileConverter.convertToIOObject(Paths.get(rootToIOObject).toFile)
  def execute(file: File) = {
    print("hello")
  }

}
