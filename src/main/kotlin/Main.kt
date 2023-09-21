package exemples

import java.io.DataInputStream
import java.io.FileInputStream
import java.io.RandomAccessFile

fun main(args: Array<String>) {
    val f =  DataInputStream(FileInputStream("Empleats.dat"))
    while (f.available() > 0) {
    println("Nom: " + f.readUTF())
    println("Desnivell.: " + f.readInt())
    println("Desnivell acumulat: " + f.readInt())
    println("Numero de punts: " + f.readInt())
    println("Punts: " + f.readInt())
    f.close()
}
}

