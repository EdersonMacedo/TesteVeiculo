
import javax.swing.JOptionPane;

public class Gasolina {
    public static void main(String[] args) {
        double gasolina;
        double litro;
        int soma = 1;
        
        gasolina = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da gasolina:"));
        litro = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de litros que você quer abastecer:"));
        
        while(soma > 0)
        if(gasolina == 10){
            JOptionPane.showMessageDialog(null,"Você vai andar 200,00 R$");
            System.out.println("Você vai andar 200,00 R$");
        }
    }
}
