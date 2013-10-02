
import java.text.DecimalFormat;

public class TestarVeiculo {
    public static void main(String[] args) {
   
        
//        Veiculo v1 = new Veiculo("AZUL");
//        System.out.println("QTD VEICULO CRIADOS (V1)..: "+v1.getQtdInstancias());
//        Veiculo v2 = new Veiculo("BRANCO");
//        System.out.println("QTD VEICULO CRIADOS (V2)..: "+v2.getQtdInstancias());
//        Veiculo v3 = new Veiculo("PRETO");
//        System.out.println("QTD VEICULO CRIADOS (V3)..: "+v3.getQtdInstancias());
//        Veiculo v4 = new Veiculo("AMARELO");
//        Veiculo v = new Veiculo(" ");
//        System.out.println("QTD VEICULO CRIADOS (V4)..: "+v4.getQtdInstancias());
        
        
        DecimalFormat df = new DecimalFormat("###,###.###");
        double valor = 10000.50;
        System.out.println("Valor: " + df.format(valor));
        
        
        String dado = "10.000,5a";
        dado = dado.replaceAll("[.]", "").replaceAll("[,]", ".");
        
        for(char c : dado.toCharArray()){
            
            if(c !=  '.' &&  Character.getType(c) != Character.DECIMAL_DIGIT_NUMBER){
                System.out.println("O numero inválido");
                return;
            }
        }
        
        
        double teste = Double.parseDouble(dado);
        
        //double teste = df.
        
        
}
}