package exemples

import java.io.DataInputStream
import java.io.FileInputStream
import java.sql.DriverManager.println

fun main(args: Array<String>) {
    val f = DataInputStream(FileInputStream("Rutes.dat"))

    while (f.available() > 0) {
        System.out.println("Ruta: " + f.readUTF())
        System.out.println("Desnivell: " + f.readInt())
        System.out.println("DesnivellAcumulat: " + f.readInt())
        var punts = f.readInt()
        System.out.println("Té $punts punts")
        for(i in 1..punts){
           System.out.println("Punt $i: " + f.readUTF() + "(" + f.readDouble()+ "," + f.readDouble() + ")")
        }
    }
    f.close()
}

