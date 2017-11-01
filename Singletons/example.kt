data class Carro(val nome:String)
object CarroService {
    fun getCarros(): List<Carro>{
        val carros = mutableListOf<Carro>()
        for (i in 1..3){
            val c = Carro("Carro $i")
            carros.add(c)
        }
        return carros
    }
}
fun main (args: Array<String>){
    val carros = CarroService.getCarros()
    for(c in carros){
        println(c)
    }
}


/*
Carro(nome=Carro 1)
Carro(nome=Carro 2)
Carro(nome=Carro 3)
Carro(nome=Carro 4)
Carro(nome=Carro 5)

Um objeto singleton tem uma única instância durante toda a execução do programa, portanto tenha
cuidado ao armazenar atributos na classe, pois eles serão compartilhados por toda a aplicação
*/
