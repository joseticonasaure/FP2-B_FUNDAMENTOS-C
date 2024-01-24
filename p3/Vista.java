import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Vista extends JFrame {
    private JPanel tableroPanel;

    public Vista(String[][] tablero, ArrayList<Ejercito> reinoA, ArrayList<Ejercito> reinoB) {
        setTitle("Tablero ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        tableroPanel = new JPanel(new GridLayout(11, 11));
        tableroPanel.add(new JLabel(" "));
        for (char columna = 'A'; columna <= 'J'; columna++) {
            tableroPanel.add(new JLabel(String.valueOf(columna), SwingConstants.CENTER));
        }

        for (int i = 0; i < tablero.length; i++) {
            if (i + 1 < 10) {
                tableroPanel.add(new JLabel(" " + (i + 1), SwingConstants.RIGHT));
            } else {
                tableroPanel.add(new JLabel(String.valueOf(i + 1), SwingConstants.RIGHT));
            }
            for (int j = 0; j < tablero[i].length; j++) {
                JLabel casillaLabel = new JLabel("", SwingConstants.CENTER);
                casillaLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                if (tablero[i][j] != null) {
                    String reinoEjercito = tablero[i][j];
                    String[] partes = reinoEjercito.split(" ");
                    String nombreReino = partes[0];
                    int indiceEjercito = Integer.parseInt(partes[1]);
                    Ejercito ejercitoEncontrado = null;
                    for (Ejercito ejercito : reinoA) {
                        if (ejercito.getNombreReino().equals(nombreReino) && reinoA.indexOf(ejercito) == indiceEjercito) {
                            ejercitoEncontrado = ejercito;
                            break;
                        }
                    }
                    if (ejercitoEncontrado == null) {
                        for (Ejercito ejercito : reinoB) {
                            if (ejercito.getNombreReino().equals(nombreReino) && reinoB.indexOf(ejercito) == indiceEjercito) {
                                ejercitoEncontrado = ejercito;
                                break;
                            }
                        }
                    }
                    if (ejercitoEncontrado != null) {
                        int totalSoldados = ejercitoEncontrado.getNumeroSoldados();
                        int vidaTotal = ejercitoEncontrado.getSumaVidaTotal();
                        String info = totalSoldados + "-" + vidaTotal + "-" + nombreReino.charAt(0);
                        casillaLabel.setText(info);
                    } else {
                        casillaLabel.setText("        ");
                    }
                } else {
                    casillaLabel.setText("        ");
                }
                tableroPanel.add(casillaLabel);
            }
        }

        setLayout(new BorderLayout());
        add(tableroPanel, BorderLayout.CENTER);

        setVisible(true);
    }
}
