package problema_repeticao

fun main(){

    val a: Int = readLine()!!.toInt()
    val b: Int = readLine()!!.toInt()
    var soma = 0

    for(i in a..b){
        soma += i
    }
    println(soma)
}