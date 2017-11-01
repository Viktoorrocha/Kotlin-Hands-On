// Carro.java

public class Carro {
    private String nome;
    public Carro(String nome){
        super();
        this.nome = nome;
    }
    public String getNome(){
        retunr nome;
    }
    public void setNome(String nome){
        this.nome;
    }
    @override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }
    @override
    public boolean equals (Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Carro other = (Carro) obj;
        if (nome == null){
            if (other.nome != null)
            return false;
        } else if (!nome.equals(other.nome))
             return false;
          return false;          
    }
    @override
    public String toString(){
        return "Carro [nome=" + nome + "]";
    }
}
//******************************************************************************

//Carro.kt

data class Carro (val nome:String)

/* Data classes têm uma uma sintaxe enxuta, mais automaticamente implementam as respectivas funções : 

equals() / hashCode() 
toString() 
componentN() functions
copy()

Permite acessar os atributos facilmente, sem a necessidade dos get/set.
