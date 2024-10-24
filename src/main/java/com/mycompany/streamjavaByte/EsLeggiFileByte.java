/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.streamjavaByte;

import java.io.*;

/**
 *
 * @author frida
 */
public class EsLeggiFileByte {

    public void LeggiBytesFromFile(String sourcePath) throws FileNotFoundException, IOException {
        FileInputStream is;
        is = new FileInputStream(sourcePath);
        int x;
        x = is.read();
        int n = 0;
        while (x >= 0) {
            System.out.print(" " + x);
            n++;
            x = is.read();
        }
        System.out.println("\nTotale byte: " + n);
        is.close();
    }
}
