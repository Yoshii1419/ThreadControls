/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testejava;

/**
 *
 * @author Yuri.Ramos
 */
public class TesteJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Customer banana = new Customer();
        
        banana.inicializaTudo(4, "Charles Brilho", 234567345);        
  
        System.out.println("Nome = " + banana.getName() + " " + banana.getIdentificationNumber());
        
        System.out.println("Idade: " + banana.getIdade(1994, 2017));
        
        ThreadFrame frame = new ThreadFrame();
        frame.setResizable(false);
        frame.setVisible(true);
        
    }
    
}
