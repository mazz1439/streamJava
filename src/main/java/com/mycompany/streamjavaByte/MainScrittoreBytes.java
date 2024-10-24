/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.streamjavaByte;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author frida
 */
public class MainScrittoreBytes {
    public static void main(String[] args) {

        /**
         * scrittura in file, solo byte
         */
        // Creazione di un JFileChooser per scegliere il file di destinazione
        JFileChooser saveFileChooser = new JFileChooser();
        saveFileChooser.setDialogTitle("Seleziona dove scrivere il file");

        saveFileChooser.setFileFilter(new FileNameExtensionFilter("Text Files", "txt"));
        // Mostra la finestra di dialogo per salvare un file
        int saveResult = saveFileChooser.showSaveDialog(null);

        if (saveResult == JFileChooser.APPROVE_OPTION) {
            String destinationPath = saveFileChooser.getSelectedFile().getAbsolutePath();
            try {
                EsScriviFileByte scrittore1 = new EsScriviFileByte();
                scrittore1.ScriviBytesInFile(destinationPath);
            } catch (IOException ex) {
                Logger.getLogger(MainScrittoreBytes.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            System.out.println("Nessun file di destinazione selezionato.");
        }

    }
}
