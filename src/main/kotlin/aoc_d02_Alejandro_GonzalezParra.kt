import java.io.File

fun main() {

    var horizontalPosition = 0 //Horizontal position
    var depth = 0 //Depth
    var aim = 0 //Aim

    val input = File("C:\\Users\\usuarioT\\IdeaProjects\\advent_of_code_2021\\input\\input_day2.txt")
    val commandList = mutableListOf<String>()

    input.forEachLine { commandList.add(it) }

    commandList.forEach {
        //Divido en una lista de dos elementos el string de cada elemento
        // En el primero estará la instrucción en texto, y en el segundo el número correspondiente.
        val list = it.split(" ")
        //Si el primer elemento es "forward", cojo el segundo y se lo añado a la posición horizonal y a la profundidad según el aim.
        //Si es "up", le resto al aim el elemento 2.
        //Si es "down", le sumo al aim el elemento 2.
        when (list[0]) {
            //
            "forward" -> { horizontalPosition += list[1].toInt(); depth += ( aim * list[1].toInt() ) }
            "up" -> aim -= list[1].toInt()
            "down" -> aim += list[1].toInt()
        }
    }

    println("Depth: $depth")
    println("Horizontal position: $horizontalPosition")

    println("Horizontal position x depth: ${horizontalPosition * depth}")

}