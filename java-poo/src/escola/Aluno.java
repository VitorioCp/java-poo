package escola;

public class Aluno {
    private String nome;
    private int idade;
    
    
    //nome
    public String getNome(){
        return nome;
    }

    public void setNome(String newNome){
        nome = newNome;
    }
    
    //idade
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
