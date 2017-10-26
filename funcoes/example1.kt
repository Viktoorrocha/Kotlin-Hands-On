fun main(args: Array<String>){
    var nome = "Gizelly"
    imprimir (nome)
    val soma = somar(2,3)
    imprimir("Soma: $soma")
}

fun imprimir(s: String): Unit {
    println(s)
}

fun somar(a: Int, b: Int): Int {
    return a + b

}

/*
Gizelly
Soma: 5
// Uma curiosidade é que, quando a função não possui retorno, a palavra "Unit" pode ser omitida