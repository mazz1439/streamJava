/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.streamjavaByte;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author frida
 */
public class MainLettoreBytes {

    public static void main(String[] args) {
        /**
         * lettura da file, solo byte
         */
        // Creazione di un JFileChooser per scegliere il file sorgente da leggere
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Seleziona il file da leggere");

        // Mostra la finestra di dialogo per aprire un file
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            String sourcePath = fileChooser.getSelectedFile().getAbsolutePath();

            try {
                EsLeggiFileByte lettore1 = new EsLeggiFileByte();
                lettore1.LeggiBytesFromFile(sourcePath);
            } catch (IOException ex) {
                Logger.getLogger(MainLettoreBytes.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("Nessun file sorgente selezionato.");
        }
   
    }
}
