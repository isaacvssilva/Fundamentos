package problema_estrutura_sequencial

fun main(){

    var velocidade: Float = readLine()!!.toFloat()
    velocidade = (velocidade)

    var tempo: Float = readLine()!!.toFloat()
    tempo = (tempo)

    val consumo: Float = readLine()!!.toFloat()

    val distancia: Float = (velocidade*(tempo/60))
    val desempenho: Float = (distancia / consumo)

    println(String.format("%.2f", desempenho))
}