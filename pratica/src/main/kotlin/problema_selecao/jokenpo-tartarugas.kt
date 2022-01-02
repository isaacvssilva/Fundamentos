package problema_selecao

fun main() {

    val jog1: Char = readLine().toString()[0]
    val jog2: Char = readLine().toString()[0]

    if (jog1 == jog2) {
        println("empate")
    } else if ((jog1 == 'R') and (jog2 == 'S')) {
        println("Jog1")
    } else if ((jog1 == 'P') and (jog2 == 'R')) {
        println("jog1")
    } else if ((jog1 == 'S') and (jog2 == 'P')) {
        println("jog1")
    } else println("jog2")
}