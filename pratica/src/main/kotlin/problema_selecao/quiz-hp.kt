package problema_selecao

fun main(){

    println("1 - A que casa pertencia Harry Potter e seus amigos?")
    print("\n")
    println("a) Hufflepuff")
    println("b) Ravenclaw")
    println("c) Slytherin")
    println("d) Gryffindor")
    val q1:Char = readLine().toString()[0]
    print("\n")

    println("2 - Qual o nome verdadeiro do personagem" +
            " o qual é conhecido por aquele que não deve ser nomeado?")
    print("\n")
    println("a) Tom Riddle")
    println("b) Draco Malfoy")
    println("c) Bellatrix Lestrange")
    println("d) Pedro Pettigrew")
    val q2:Char = readLine().toString()[0]
    print("\n")

    println("3 - Quais dessa opções não é uma Relíquia da Morte?")
    println("a) A varinha de sabugueiro")
    println("b) A pedra da ressurreição")
    println("c) A pedra filosofal")
    println("d) A capa de invisibilidade")
    val q3:Char = readLine().toString()[0]
    print("\n")

    println("4- O ministério da magia proibiu o uso de três feitiços, " +
            "conhecidos como as maldições imperdoáveis, por ela possuírem " +
            "caráter maligno e o objetivo cruel. Marque opção abaixo que não " +
            "corresponde a umas das maldições imperdoáveis:")
    println("a) Crucio")
    println("b) Imperio")
    println("c) Avada Kedavra")
    println("d) Expecto Patronum")
    val q4:Char = readLine().toString()[0]

    println("sua resposta:$q1 $q2 $q3 $q4")

    var p = 0
    if(q1 == 'd'){
        p+=1
    }
    if(q2 == 'a'){
        p+=1
    }
    if(q3 == 'c'){
        p+=1
    }
    if(q4 == 'd'){
        p+=1
    }

    when (p) {
        0 -> {
            println("Nunca assistiu")
        }
        1 -> {
            println("Ja ouviu falar")
        }
        2 -> {
            println("Interessado no assunto")
        }
        3 -> {
            println("fa")
        }
        else -> {
            println("Super fa")
        }
    }
}