
import javax.swing.JOptionPane;

public class Gasolina {
    public static void main(String[] args) {
        String gasolina;
        String litro;
        int soma = 1;
        double gasolinaS;
        
        gasolina = JOptionPane.showInputDialog("Informe o valor da gasolina:");
        litro = JOptionPane.showInputDialog("Informe a quantidade de litros que você quer abastecer:");
        
        gasolina.replaceAll( "," , "." );  
        gasolinaS = Double.parseDouble(gasolina); 
        
        while(soma > 0)
        if(gasolinaS == 10){
            JOptionPane.showMessageDialog(null,"Você vai andar 200,00 R$");
            System.out.println("Você vai andar 200,00 R$");
        }else if (gasolinaS < 10 && gasolinaS > 10){
            JOptionPane.showMessageDialog(null,"AA pegadinha do malandro!!!!!");
            System.out.println("AA pegadinha do malandro!!!!!");
        }
    }
}