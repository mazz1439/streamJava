/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.streamjavaData;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 *
 * @author frida
 */
public class ScrittoreDataInFile {

    public void ScriviDataInFile(String destinationPath) throws FileNotFoundException, IOException {
        /* parametro true è per la modalità append*/
        FileOutputStream fos = new FileOutputStream(destinationPath,true);
        DataOutputStream dos = new DataOutputStream(fos);
       //  dos.writeInt((int)123);
//        dos.writeFloat((float)123.45F);
//        dos.writeLong((long)789);
        
//        float f = 3.1415f;
//        boolean b = true;
//        char c = 'X';
//        double d = 1.4142;
//        int i = 12;
//        dos.writeFloat(f);
//        dos.writeBoolean(b);
//        dos.writeChar(c);
        dos.writeDouble(1.4142);
//        dos.writeInt(i);
        dos.flush();
        dos.close();
    }
}
