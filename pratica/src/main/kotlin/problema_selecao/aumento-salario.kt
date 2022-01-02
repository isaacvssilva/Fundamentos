package problema_selecao

fun main(){

    val salarioAtual:Float = readLine()!!.toFloat()
    val novoSalario:Float

    val aumento1 = 0.20F
    val aumento2 = 0.15F
    val aumento3 = 0.10F
    val aumento4 = 0.05F

    if(salarioAtual <= 1000.00){
        novoSalario = salarioAtual + (salarioAtual*aumento1)
        println(String.format("%.2f", novoSalario))

    }else if((salarioAtual > 1000.00) and (salarioAtual <= 1500.00)){
        novoSalario = salarioAtual + (salarioAtual*aumento2)
        println(String.format("%.2f", novoSalario))

    }else if(salarioAtual <= 2000.00){
        novoSalario = salarioAtual + (salarioAtual*aumento3)
        println(String.format("%.2f", novoSalario))

    }else if(salarioAtual > 2000.00){
        novoSalario = salarioAtual + (salarioAtual*aumento4)
        println(String.format("%.2f", novoSalario))
    }
}