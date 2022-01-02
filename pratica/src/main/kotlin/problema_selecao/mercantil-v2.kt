package problema_selecao

fun main(){

    val jog1:Float = readLine()!!.toFloat()
    val jog2:Char = readLine().toString()[0]
    val valorP: Float = readLine()!!.toFloat()

    if((jog1 > valorP) and (jog2 == 'm')){
        println("segundo")
    }else if((jog1 > valorP) and (jog2 == 'M')){
        println("primeiro")
    }else if((jog1 < valorP) and (jog2 == 'M')){
        println("segundo")
    }else if((jog1 < valorP) and (jog2 == 'm')){
        println("primeiro")
    }
}