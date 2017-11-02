fun String.ascii(): String {
    var s = ""
    for (c in this){
        s += c.toInt()
    }
    return s 
}
fun main(args: Array<String>){
    val palavra = "pneumoultramicroscopicossilicovulcanoconiótico"
    val ascii = palavra.ascii()
    println(ascii)
}

/* o Kotlin é inteligente e aceita que o for seja feito diretamente na String. Depois, o método toInt() foi usado para
converter o caractere para inteiro, para obter o código ascii.