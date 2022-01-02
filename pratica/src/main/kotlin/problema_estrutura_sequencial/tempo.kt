package problema_estrutura_sequencial

fun main(){

    val tempoSeg: Int = readLine()!!.toInt()
    val hora: Int = (tempoSeg/3600)
    val min: Int = (tempoSeg/60) - (hora*60)
    val seg: Int = tempoSeg - (hora*3600) - (min*60)

    println("horario:$hora:$min:$seg")
}