/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.streamjavaData;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author frida
 */
public class MainScrittoreData {
    public static void main(String[] args) {
        /**
         * scrittura in file, dati tipizzato
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
                ScrittoreDataInFile scrittore1 = new ScrittoreDataInFile();
                scrittore1.ScriviDataInFile(destinationPath);
            } catch (IOException ex) {
                Logger.getLogger(MainScrittoreData.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("Nessun file di destinazione selezionato.");
        }
    }
}
