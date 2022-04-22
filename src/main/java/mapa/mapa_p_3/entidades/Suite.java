/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapa.mapa_p_3.entidades;

/**
 *
 * @author rodri
 */
public class Suite {
    private int numero;
    private String tipo;
    private int capacidade;
    private double valorDiaria;
    
    public Suite(){};
    
    public Suite(int num, String tp, int cap, double vd){
        this.numero = num;
        this.tipo = tp;
        this.capacidade = cap;
        this.valorDiaria = vd;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
    
}
