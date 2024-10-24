/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.streamjavaChar;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author frida
 */
public class MainLettoreScrittoreChar {

    public static void main(String[] args) {
        // Creazione di un JFileChooser per scegliere il file sorgente da leggere
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Seleziona il file da leggere");
        // Mostra la finestra di dialogo per aprire un file
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            String sourcePath = fileChooser.getSelectedFile().getAbsolutePath();
            JFileChooser saveFileChooser = new JFileChooser();
            saveFileChooser.setDialogTitle("Seleziona dove scrivere il file");
            //  filtro per scegliere solo file con una certa estensione
            saveFileChooser.setFileFilter(new FileNameExtensionFilter("Text Files", "txt"));
            int saveResult = saveFileChooser.showSaveDialog(null);
            if (saveResult == JFileChooser.APPROVE_OPTION) {
                String destinationPath = saveFileChooser.getSelectedFile().getAbsolutePath();
                try {
                    LettoreScrittoreChar copiatore = new LettoreScrittoreChar();
                    copiatore.CopiaCharInFile(sourcePath, destinationPath);
                } catch (IOException ex) {
                    Logger.getLogger(MainLettoreScrittoreChar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
