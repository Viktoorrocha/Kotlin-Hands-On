open class Automovel(modelo:String, ano:Int){
    val modelo:String
    val ano:Int
    init{
        this.modelo = modelo
        this.ano = ano
    }

open fun acelerar (velocidade:Int){
    print("Acelerando este automovel a $velocidade km/h");
}

override fun toString():String {
    return "Automovel $modelo, ano: $ano"
    }
}
class Carro(modelo:string, ano:Int): Automovel(nome,ano){
    override fun acelerar(velocidade:Int) {
        print("Acelarando este carro $velocidade");
    }
}

fun main(args: Array<String>){
    val c1 = Carro("Fusca",1950)
    print(c1)
    print("Carro ${c1.modelo}, ano: ${c1.ano}")
    c1.acelerar(120)
}

/*

Automovel Fusca, ano: 1950
Carro Fusca, ano: 1950
Acelarando este carro 120 km/h

Para que a herança pudesse ser realizada, a classe Automóvel foi anotada como open, pois no Kotlin todas as classes são
final por padrão, ou seja, não é possivel utilizar herança.

O mesmo vale para métodos.Observe que o método acelerar(Int) foi anotado como open, somente assim ele pode ser sobreescrito.

*/

