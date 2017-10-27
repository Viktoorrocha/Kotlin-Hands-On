fun main(args: Array<String>){
var i = getInteiro("5")
println(i)
i = getInteiro(null)
println(i)
i = getInteiro(null, 2)
println(i)
}

fun getInteiro(s: String?, defaultValue: Int = 0): Int {
    if(s: != null) {
        return s.toInt()
    }
    return defaultValue
}

/* 
Um dos recursos mais interessantes do Kotlin é que os parâmetros das funções podem ter valores-padrão, o que evitar ter
de criar vários métodos com a mesma assinatura (method overloading)
 
