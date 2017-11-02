fun filtrar(list: List<Int>, filtro: (Int) -> (Boolean)): List<Int>{
    val newList = arrayListOf<Int>()
    for (item in list) {
        if(filtro(item)){
            newList.add(item)
        }
    }
    return newList
}
fun numerosPares(numero: Int) = numero % 2 == 0 
fun numerosMaiorQue3(numero: Int) = numero > 3 
fun main(args: Array<String>){
    val ints = listOf(1,2,3,4,5)
    println(ints)
    var list = filtrar(ints, ::numerosPares)
    println(list)
    list = filtrar(ints, ::numerosMaiorQue3)
    println(list)
}

/* Neste código as funçoões numerosPares(Int) e numerosMaiorQue3(Int) são utilizadas para filtrar a lista de inteiros.
Ao declarar a função filtrar (list,filtro), vemos que a sintaxe (Int) -> (Boolean) foi utilizada para informar
que a função que será passada como parâmetro de receber um inteiro e retornar um booleano.