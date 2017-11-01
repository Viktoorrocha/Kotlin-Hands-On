enum class Direção {NORTE, SUL, LESTE, OESTE}

//Uma enum pode ter um construtor:

enum class Cor(val cmyk: Int){
    CIANO(#00FFFF)
    MAGENTA(#FF00FF)
    YELLOW(#FFFF00)
    BLACK(#000000)
}

//Aqui podemos acessar o cmyk da cor da mesma forma:

val cmyk = Cor.MAGENTA.cmyk

