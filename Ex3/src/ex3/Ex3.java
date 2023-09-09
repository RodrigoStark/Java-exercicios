/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Rodrigo
 */
public class Ex3 {

    public static void main(String[] args) {
        Toolkit Tamanho = Toolkit.getDefaultToolkit();
        Dimension dimensao = Tamanho.getScreenSize();
        System.out.println(dimensao.toString());
        System.out.println("A tela tem a resolução de: " + dimensao.width + " X " + dimensao.height);
        
    }
    
}
