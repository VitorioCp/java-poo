package enums;

public enum EstadoBrasileiro{
    SAO_PAULO ("Sp", "São Paulo", 11),
    RIO_JANEIRO("RJ", "Rio de janeiro", 12),
    PIAUI("PI", "Piaui", 13),
    Maranhao( "MA", "Maranhão", 14),
    CEARA("CE", "Ceará", 15);
    
    private String nome;
    private String sigla;
    private int ibge;
    
    
    
    private EstadoBrasileiro(String sigla, String nome, int ibge){
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
        }

        public int getIbge() {
            return ibge;
        }
        
        public String getSigla(){
        return sigla;
        }
        
        public String getNome(){
        return nome;
        }
        
        public String getNomeMaiusculo(){
        return nome.toUpperCase();
        }
    }