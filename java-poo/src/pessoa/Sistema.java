package pessoa;

public class Sistema {

    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("123", "Vitorio");

        marcos.setEndereco("Estrada do Canhaga");

        System.out.println(marcos.getNome() + " - " + marcos.getCpf());
    }
}
