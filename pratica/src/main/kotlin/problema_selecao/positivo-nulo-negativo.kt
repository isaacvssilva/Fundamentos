package problema_selecao

fun main(){
    val value: Int = readLine()!!.toInt()

    if(value > 0){
        println("positivo")
    }else{
        if(value == 0){
            println("nulo")
        }else{
            println("negativo")
        }
    }
}