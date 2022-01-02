package problema_selecao

fun main(){

    val jog1: Int = readLine()!!.toInt()
    val jog2: Int = readLine()!!.toInt()
    val jog3: Int = readLine()!!.toInt()

    if((jog1 == jog2) and (jog2 == jog3)){
        println("empate")
    }else if((jog1 != jog2) and (jog2 == jog3)){
        println("jog1")
    }else if((jog2 != jog1) and (jog1 == jog3)){
        println("jog2")
    }else{
        println("jog3")
    }
}