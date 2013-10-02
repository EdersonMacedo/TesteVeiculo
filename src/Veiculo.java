public class Veiculo {
    private static double qtdInstancias;
    private String cor;
    
    public Veiculo(String cor){
        this.cor = cor;
        qtdInstancias++;
    }
    public Veiculo(){
        
    }
    public String getCor() {
        return cor;
    }

    public static double getQtdInstancias() {
        return qtdInstancias;
    }
    
}
