package problema_selecao

fun main(){

    val jogador1: Char = readLine().toString()[0]
    val nDedos1:Int = readLine()!!.toInt()
    val nDedos2: Int = readLine()!!.toInt()

   if(jogador1 == 'p') {
       if((nDedos1 + nDedos2) % 2 == 0){
           println("venceu")
       }else println("perdeu")
   }else if(jogador1 == 'i'){
       if((nDedos1 + nDedos2) % 2 != 0){
           println("venceu")
       }else println("perdeu")
   }
}