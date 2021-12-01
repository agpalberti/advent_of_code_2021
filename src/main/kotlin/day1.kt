import java.io.File


fun main() {
    val lista= mutableListOf<Int>()
    val a:File = File("C:\\Users\\usuarioT\\IdeaProjects\\advent_of_code_2021\\input\\input_day1.txt")
    a.forEachLine { lista.add(it.toInt()) }

    var counter = 0

    for (i in 1 until lista.size){
        if (lista[i]>lista[i-1]) counter++
    }

    println(counter)

    val newList = mutableListOf<Int>()

    for(i in 0 until lista.size-2){
        val it = lista[i] + lista[i+1] + lista[i+2]
        newList.add(it)

    }

    counter = 0

    for(i in 1 until newList.size){
        if (newList[i]>newList[i-1]) counter++
    }

    println(counter)
}