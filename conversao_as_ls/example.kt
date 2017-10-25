fun main(args: Array<String>){
    val simbolo:Any = "Pentagrama"
    println (simbolo as String )
    println (simbolo as? Int )

    if ( simbolo is String) {
        println("$simbolo é uma String")
    }
}


/*
Pentagrama
null
Pentagrama é uma String
*/

/*
Observe que a segunda linha imprimiu null, pois uma String não pode ser convertida para Int.Dependendo do caso, este comportamento
pode ser melhor do que lançar uma exceção.
*/