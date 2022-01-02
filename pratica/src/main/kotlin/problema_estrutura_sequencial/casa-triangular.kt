package problema_estrutura_sequencial
import kotlin.math.sqrt

fun main(){
    val a: Float = readLine()!!.toFloat()
    val b: Float = readLine()!!.toFloat()
    val c: Float = readLine()!!.toFloat()

    val p: Float = (a+b+c)/2
    val area: Float = (sqrt(p*(p-a)*(p-b)*(p-c)))
    println(String.format("%.2f", area))
}