package problema_repeticao

fun main(){

    val n:Int = readLine()!!.toInt()
    var cont = 0

    for(i in 0 until n){
        cont++
        println("$cont) Vou estudar FUP todos os dias!")
    }
}
