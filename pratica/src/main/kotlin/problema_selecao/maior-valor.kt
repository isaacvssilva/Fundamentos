package problema_selecao

fun main(){

    val a:Int = readLine()!!.toInt()
    val b:Int = readLine()!!.toInt()
    val c:Int = readLine()!!.toInt()
    val d:Int = readLine()!!.toInt()

    if((a>b) and (a>c) and (a>d)){
        println(a)
    }else if((b>a) and (b>c) and (b>d)){
        println(b)
    }else if((c>a) and (c>b) and (c>d)){
        println(c)
    }else if((d>a) and (d>b) and (d>c)){
        println(d)
    }
}