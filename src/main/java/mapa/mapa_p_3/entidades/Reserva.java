/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapa.mapa_p_3.entidades;

import java.util.ArrayList;
import mapa.mapa_p_3.entidades.Hospede;

/**
 *
 * @author rodri
 */
public class Reserva {
    private ArrayList<Hospede> hospedes;
    private Suite suite;
    private int quantidadePessoas;
    private int quantidadeDias;
    
    public Reserva(){};
    
    public Reserva(Suite suite, int quantDia){
            hospedes = new ArrayList<Hospede>();
            this.suite = suite;
            this.quantidadeDias = quantDia;
        }
    
    public void incluirHospede(Hospede hosp){
        if(!verificaCapacidade(hosp)){
            System.out.println("Capacidade máxima da suite alcançada!");
            System.out.println("Suite tipo: "
                    +suite.getTipo()
                    +" | Capacidade: "
                    +suite.getCapacidade());
                   
        } else {
           hospedes.add(hosp);
        }
    }
    
    public boolean verificaCapacidade(Hospede hosp){
        if(hosp.getIdade()<2){
                return true;
            }
        if(this.quantidadePessoas < suite.getCapacidade()){
            if(hosp.getIdade()>2){
                this.quantidadePessoas +=1;
            }
            return true;
        }
        return false;
    }

    public double calculaDiaria(){
        if(this.quantidadeDias> 7){
            return this.quantidadeDias*this.suite.getValorDiaria()*0.90;
        }
        return this.quantidadeDias*this.suite.getValorDiaria();
    }

    

    public void removeHospede(Hospede hosp) {
        hospedes.remove(hosp);
    }

    public Suite getSuite() {
        return suite;
    }

    public void setSuite(Suite suite) {
        this.suite = suite;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public int getQuantidadeDias() {
        return quantidadeDias;
    }

    public void setQuantidadeDias(int quantidadeDias) {
        this.quantidadeDias = quantidadeDias;
    }
    
    public void imprimirHospedes(){
        for ( Hospede hospede: hospedes){
            System.out.println(hospede.getNome());
        }
    }
   
}
