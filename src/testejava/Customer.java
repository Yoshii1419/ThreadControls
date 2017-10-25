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
public class Customer {
    
    private int id;
    private String name;
    private int identification_number;
    
    public void inicializaTudo(int id, String name, int number){
        this.id = id;
        this.name = name;
        this.identification_number = number;
    }
    
    public void setId(int n) {
        id = n;
    }
    public int getId() {
        return id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    
    public void setIdentificationNumber(int n) {
        this.identification_number = n;
    }
    public int getIdentificationNumber() {
        return this.identification_number;
    }
    
    public int getIdade(int anoNasc, int anoAtual){
    
        int idade = anoAtual - anoNasc;
        
        return idade;
    }
    
    
    
}
