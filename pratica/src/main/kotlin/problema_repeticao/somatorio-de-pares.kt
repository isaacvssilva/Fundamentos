package problema_repeticao

fun main(){

    val a:Int = readLine()!!.toInt()
    val b: Int = readLine()!!.toInt()
    var soma = 0

    if(b>a){
        for (i in a..b){
            if(i % 2 == 0){
                soma += i
            }
        }
        println(soma)
    }
}