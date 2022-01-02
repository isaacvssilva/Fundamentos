package problema_selecao

fun main(){
    val a:Int = readLine()!!.toInt()
    val b:Int = readLine()!!.toInt()
    val c:Int = readLine()!!.toInt()

    if((a != b) and (b != c)){
        println(0)
    }else if((a == b) and (b != c)){
        println(2)
    }else if((a != b) and (b == c)){
        println(2)
    }else if((a == b) and (b == c)){
        println(3)
    }
}