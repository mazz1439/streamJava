/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.streamjavaChar;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author frida
 */
public class LettoreScrittoreChar {
    public void CopiaCharInFile(String sourcepath, String destinationpath) throws FileNotFoundException, IOException {
        FileReader fr = new FileReader(sourcepath);
        BufferedReader input = new BufferedReader(fr);
        FileWriter fw = new FileWriter(destinationpath);
        PrintWriter output = new PrintWriter(fw);
        String linea = input.readLine();
        while (linea != null) {
            output.println(linea);
            System.out.println(linea);
            linea = input.readLine();
        }
        input.close();
        output.close();
    }
}
