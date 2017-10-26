fun main(args: Array<String>){
    var nome = "Gizelly"
    println("Olá $nome")
    nome = null //Error: Null can not be a value of a non-null type String 
    println("Olá $nome")
}

/*
Para que possamos utilizar o valor nulo, é obrigatório declarar o seu tipo e usar o operador "?" 
*/

fun main(args: Array<String>){
    var nome:String? = "Gizelly"
    println("Olá $nome")
    nome = null
    println("Olá $nome")
}
/*
Olá Gizelly
Olá null
*/

