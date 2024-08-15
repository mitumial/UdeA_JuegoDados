import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Dado {

    private int numero;

    public void lanzar(Random rdm){
        numero = rdm.nextInt(6) + 1;
    }

    public void mostrar(JLabel lbl){
        String rutaDado = "src/img/dice" + numero + ".jpg";
        ImageIcon imgDado = new ImageIcon(rutaDado);
        lbl.setIcon(imgDado);

    }

    public int getNumero() {
        return numero;
    }


    
}