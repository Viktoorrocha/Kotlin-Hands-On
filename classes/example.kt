class Pessoa(modelo:String, ano:Int ){
    val modelo:String
    val ano:Int

    init {
        //bloco de inicialização
        this.modelo = modelo
        this.ano = ano 
       
    }

    override fun toString():String{
        return "Carro: $modelo, ano: $ano "
    }

    fun main(args: Array<String>){
        val c1 = Pessoa("Fiat Mille", 1998)
        println(c1)
        println("Carro ${c1.modelo}, ano: ${c1.ano}")
    }
}