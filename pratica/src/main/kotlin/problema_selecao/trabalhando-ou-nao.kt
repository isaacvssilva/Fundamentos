package problema_selecao

fun main(){

    val dia:Int = readLine()!!.toInt()
    val hora:Int = readLine()!!.toInt()
    val min:Int = readLine()!!.toInt()

    when {
        dia == 1 -> {
        }

        (dia > 1) && (dia < 7) -> {

            if(((hora >= 8) and (hora <= 11)) or ((hora >= 14) and (hora <= 17))){
                if((min >= 0) and (min <= 59)){
                    println("SIM")
                }
            }
        }
        else -> {

            if((hora >= 8) and (hora <= 11)){
                if((min >= 0) and (min <= 59)){
                    println("SIM")
                }
            }
        }
    }
    println("NAO")
}

