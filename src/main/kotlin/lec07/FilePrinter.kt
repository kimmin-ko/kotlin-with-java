package lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class FilePrinter {

    // checked exception이 모두 unchecked exception으로 간주된다.
    fun readFile() {
        val currentFile = File(".")
        val file = File("${currentFile.absoluteFile}/a.txt")
        val br = BufferedReader(FileReader(file))
        println(br.readLine())
        br.close()
    }

    fun readFile(path: String) {
        // use -> try with resources
        BufferedReader(FileReader(path)).use { reader ->
            {
                println(reader.readLine())
            }
        }
    }
}