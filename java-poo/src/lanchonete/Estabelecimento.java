package lanchonete;

import lanchonete.areaCliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Cozinheiro;
public class Estabelecimento {
    public static void main(String[] rgs){
        Cozinheiro cozinheiro = new Cozinheiro();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarSucoNoBalcao();

        
        

        Atendente atendente = new Atendente();
        atendente.limapandoMesa();
        atendente.servindoMesa();

        Cliente cliente = new Cliente();
        cliente.pagarConta();
        cliente.pedirLanche();
        
    }
}
