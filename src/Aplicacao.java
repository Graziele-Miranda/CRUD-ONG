import JDBC.ConnectionFactory;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Aplicacao {
    public static void main(String[] args) {
        //Testando conexão
        try {
            java.sql.Connection con = new ConnectionFactory().conecta();
            JOptionPane.showMessageDialog(null, "Conectado");
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Erro" +e);
        }
    }
}
