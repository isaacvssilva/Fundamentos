package problema_estrutura_sequencial

fun main(){
    val capacidade: Int = readLine()!!.toInt()
    val qtdBanana: Int = readLine()!!.toInt()
    val qtdGoiaba: Int = readLine()!!.toInt()
    val qtdManga: Int = readLine()!!.toInt()

    val cestaCheia: Int = (qtdBanana+qtdGoiaba+qtdManga)
    var viagem: Int = (cestaCheia/capacidade)

    if(cestaCheia%capacidade > 0){
        viagem++
    }
    println(viagem)
}