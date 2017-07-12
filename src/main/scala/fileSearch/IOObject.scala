package fileSearch

import java.io.File

/**
  * Created by jan on 08.07.2017.
  */
trait IOObject {
  val file: File
  val name: String = file.getName
}


case class FileObject(val file: File) extends IOObject
case class DirectoryObject(val file: File) extends IOObject
