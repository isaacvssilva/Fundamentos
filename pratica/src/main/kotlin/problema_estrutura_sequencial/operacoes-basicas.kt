package problema_estrutura_sequencial

fun main(){
    val a: Int = readLine()!!.toInt()
    val b: Int = readLine()!!.toInt()

    val soma: Int = (a+b)
    println("soma: $soma")

    val sub: Int = (a-b)
    println("subtracao: $sub")

    val mult: Int = (a*b)
    println("multiplicacao: $mult")

    val div: Float = (a.toFloat()/b.toFloat())
    println("divisao:" + String.format("%.2f", div))

    val resto: Int = (a%b)
    println("resto: $resto")
}