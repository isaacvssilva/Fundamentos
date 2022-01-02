package problema_estrutura_sequencial

fun main(){

    val mesadaJoao: Float = readLine()!!.toFloat()
    val mesadaPaulo: Float = readLine()!!.toFloat()
    val gasto: Float = readLine()!!.toFloat()

    val atualMesadaPaulo: Float = mesadaPaulo - gasto

    if(atualMesadaPaulo == mesadaJoao){
        println("Iguais")
    }else{
        println("Diferentes")
    }
}