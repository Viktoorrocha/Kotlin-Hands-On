fun main (args: Array<String>){
    println(enviarEmail("Cassandra"))
    println(enviarEmail("Cassandra","Olá"))

}

fun enviarEmail(usuario: String, titulo: String? = null): String {
    val s = titulo?: "Bem vindo"
    return "$s $usuario"
}


/* 
Essa função utiliza o título caso não seja nulo, ou utiliza a expressão à direita do operador Elvis 
*/