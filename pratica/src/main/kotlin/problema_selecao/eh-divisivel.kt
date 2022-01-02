package problema_selecao

fun main(){
    val n1: Int = readLine()!!.toInt()
    val n2: Int = readLine()!!.toInt()
    val div: Int = (n1/n2)

    if(div%2 == 0){
        println("sim")
    }else{
        println("nao")
    }
}