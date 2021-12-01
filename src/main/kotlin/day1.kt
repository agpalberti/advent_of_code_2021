import java.io.File


fun contarIncrementos(lista: List<Int>):Int{
    var counter = 0
    for (i in 1 until lista.size){
        if (lista[i]>lista[i-1]) counter++
    }
    return counter
}

fun main() {
    val listaEscaner= mutableListOf<Int>()
    val a:File = File("C:\\Users\\usuarioT\\IdeaProjects\\advent_of_code_2021\\input\\input_day1.txt")
    a.forEachLine { listaEscaner.add(it.toInt()) }
    
    println("Incrementos de un escaneo a otro.")
    println(contarIncrementos(listaEscaner))

    val listaEscanerEnVentana = mutableListOf<Int>()

    //Sumo los 3 elementos correspondientes y los añado a la nueva lista.
    for(i in 0 until listaEscaner.size-2){
        val it = listaEscaner[i] + listaEscaner[i+1] + listaEscaner[i+2]
        listaEscanerEnVentana.add(it)

    }
    println("Incrementos sumados en ventana:")
    println(contarIncrementos(listaEscanerEnVentana))
}