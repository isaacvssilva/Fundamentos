package problema_selecao

fun main(){
    val n1: Float = readLine()!!.toFloat()
    val n2: Float = readLine()!!.toFloat()
    val media: Float = (n1+n2)/2

    if(media >= 7){
        println(media)
        println("Aprovado")
    }else{
        if((media > 4) and (media < 7)){
            println(media)
            println("AF")
        }else{
            println(media)
            println("Reprovado")
        }
    }
}