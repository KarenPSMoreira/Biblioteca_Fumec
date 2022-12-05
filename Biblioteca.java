/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.biblioteca;
import java.awt.Color;
import java.awt.Color;

public class Biblioteca {
    

    static Livros livros[] = new Livros[999];
    static Emprestimo emp[] = new Emprestimo[999];
    static int codE = 0;
    static int op;
    static int contL = 0;
    static int contE = 0;
    static Color fundoCor = new Color(43,69,137,100);
    
    
    public static void main(String[] args) { 
		
        new menuPrincipal().setVisible(true);
			
    }
}

