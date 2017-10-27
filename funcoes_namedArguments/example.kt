fun main(args: Array<String>){
    teste("Viktor","Android Developer", "Google")
    teste ("Viktor")
    teste("Viktor", empresa = "Google")
	}

    fun teste(nome:String?, funcao:String? = null, empresa:String? = null){
         println("Nome: $nome, Função $funcao, Empresa: $empresa")
    }


    //Nome: Viktor, Função Android Developer, Empresa: Google
    //Nome: Viktor, Função null, Empresa: null
    //Nome: Viktor, Função null, Empresa: Google

    
