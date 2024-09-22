package pilaresDoPOO;

//Polimofismo
public class Carro extends Veciulo{

  

    public void ligar(){
        //Encapsulamento
        confereAgua();
        confereCombustivel();
        confereMacha();
        System.out.println("Carro ligado");
    }
    private void confereCombustivel(){
        System.out.println("Verificando combustivel");
    }
    private void confereAgua(){
        System.out.println("Verificando agua");
    }
    private void confereMacha(){
        System.out.println("Verificando macha");
    }
}
