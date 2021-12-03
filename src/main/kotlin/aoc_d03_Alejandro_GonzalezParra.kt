import java.io.File

fun main(){

    val input = File("C:\\Users\\usuarioT\\IdeaProjects\\advent_of_code_2021\\input\\input_day03.txt")

    val inputList = mutableListOf<String>()

    input.forEachLine { inputList.add(it) }

    inputList.count{ it[0] == '1'}

}