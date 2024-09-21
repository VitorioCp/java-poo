package lanchonete.areaCliente;

public class Cliente {
    public void pedirLanche(){
        System.out.println("Pedir lanche");
    }
    public void pagarConta(){
        System.out.println("Pagar o lanche");
    }

    @SuppressWarnings("unused")
    private void consultarSaldo(){
        System.out.println("Consultar o saldo da conta");

    }

}
