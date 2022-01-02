package problema_selecao

fun main(){

    val n1:Float = readLine()!!.toFloat()
    val n2:Float = readLine()!!.toFloat()
    val n3:Float = readLine()!!.toFloat()
    val trabalho:Float = readLine()!!.toFloat()
    val result: Float
    var aux: Float = n1

    if(aux > n2){
        aux = n2
    }else if(aux > n3){
        aux = n3
    }
    result = ((n1+n2+n3+trabalho-aux)/3)
    if(result >= 7){
        println("Aprovado com "+ String.format("%.1f", result))
    }else{
        println("Final com "+ String.format("%.1f", result))
    }
}
