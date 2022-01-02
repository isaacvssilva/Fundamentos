package problema_selecao

fun main(){

    val a:Int = readLine()!!.toInt()
    val b:Int = readLine()!!.toInt()
    val simbolo:String = readLine().toString()

    if(simbolo == "+"){
        println(a+b)
    }else if(simbolo == "-"){
        println(a-b)
    }else if(simbolo == "*"){
        println(a*b)
    }else if(simbolo == "/"){
        if(b!=0){
            println(a/b)
        }else println("invalida")
    }
}
