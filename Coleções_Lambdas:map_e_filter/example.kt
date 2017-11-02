fun main(args: Array<String>){
    val nomes = listOf("Viktor","Rocha")
    //Lista multiplicada por 2
    val uppercaseList = nomes.map {it.toUpperCase()}
    println(uppercaseList)
    //filtrar apenas os pares
    val ints = listOf(1,2,3,4,5)
    val pares = ints.filter {it % 2 == 0}
    println(pares) 

}