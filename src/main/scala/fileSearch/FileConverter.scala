package fileSearch

import java.io.File

/**
  * Created by jan on 11.07.2017.
  */
object FileConverter {

  def convertToIOObject(file: File) =
    if(file.isDirectory) DirectoryObject(file)
    else FileObject(file)
}
