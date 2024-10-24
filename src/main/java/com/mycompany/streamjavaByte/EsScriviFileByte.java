/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.streamjavaByte;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author frida
 */
public class EsScriviFileByte {

    public void ScriviBytesInFile(String destinationPath) throws FileNotFoundException, IOException {  
        /* parametro true è per la modalità append*/
        FileOutputStream fos = new FileOutputStream(destinationPath, true);
        //l'intero viene convertito in esadecimale, visto che 1B=due esadecimali
        //https://en.wikipedia.org/wiki/Basic_Latin_(Unicode_block)
        for (int x = 0; x < 10; x += 3) {
            System.out.println("Scrittura di " + x);
            fos.write(x);
        }
         int b = 38; //26 in HEX, che è la &
        System.out.println(b);
         fos.write(b);
         fos.flush();
        fos.close();
    }
}
