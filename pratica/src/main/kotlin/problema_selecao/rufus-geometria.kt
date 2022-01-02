package problema_selecao

fun main(){

    val l1:Int = readLine()!!.toInt()
    val l2:Int = readLine()!!.toInt()
    val l3:Int = readLine()!!.toInt()

    if((l1 + l2) < l3){
        println("invalido")
    }else if((l1+l2) > l3){

        if((l1 == l2) and (l2 == l3)){
            println("equilatero")

        }else if((l1 == l2) and (l2 != l3)){
            println("isosceles")
        }else println("escaleno")
    }
}