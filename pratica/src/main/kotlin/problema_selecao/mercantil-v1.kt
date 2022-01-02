package problema_selecao

import kotlin.math.abs

fun main(){

    val valorP:Float = readLine()!!.toFloat()
    val chute1:Float = readLine()!!.toFloat()
    val chute2:Float = readLine()!!.toFloat()
    //funcao abs para pegar o valor absoluto (desconsiderando sinal)
    if(abs(chute1-valorP) < abs(chute2-valorP)){
        println("primeiro")
    }else if(abs(chute2-valorP) < abs(chute1-valorP)){
        println("segundo")
    }else println("empate")
}