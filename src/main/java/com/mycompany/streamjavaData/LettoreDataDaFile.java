/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.streamjavaData;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author frida
 */
public class LettoreDataDaFile {

    void LeggiDataDaFile(String sourcePath) throws FileNotFoundException, IOException {
        FileInputStream is;
        is = new FileInputStream(sourcePath);
        DataInputStream dis = new DataInputStream(is);
        int i = dis.readInt();
        System.out.println("\n int: " + i);
        double d = dis.readDouble();
        System.out.println("\ndouble: " + d);

        dis.close();
        is.close();
    }

}
