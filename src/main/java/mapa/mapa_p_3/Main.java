/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapa.mapa_p_3;

import java.util.ArrayList;
import mapa.mapa_p_3.entidades.Hospede;
import mapa.mapa_p_3.entidades.Reserva;
import mapa.mapa_p_3.entidades.Suite;

/**
 *
 * @author rodri
 */
public class Main {
    
    public static void main(String[] args){
        //cria as suites para teste
        Suite suite1 = new Suite(01, "Suite A", 2, 10);
        Suite suite2 = new Suite(02, "Suite B", 1, 10);
        
        //cria a reserva de teste 1, passando a suite e quantidade de dias
        Reserva teste1 = new Reserva(suite1, 6);
        
        //cria hospedes para testar as regras de negocio
        Hospede hosp1 = new Hospede(1, "joao", "rua das flores, 266 - São Paulo-SP", 32);
        teste1.incluirHospede(hosp1);
        Hospede hosp2 = new Hospede(2, "maria", "rua das flores, 266 - São Paulo-SP", 31);
        teste1.incluirHospede(hosp2);
        //mostra que hospedes com menos de 2 anos não contam na capacidade da suite
        Hospede hosp3 = new Hospede(3, "enzo", "rua das flores, 266 - São Paulo-SP", 1);
        teste1.incluirHospede(hosp3);
        System.out.println("Quantidade de pagantes no quarto: "+teste1.getQuantidadePessoas());
        System.out.println("Lista de hóspedes da "+ teste1.getSuite().getTipo());
        teste1.imprimirHospedes();
        //imprime o valor da diária para os 6 dias de estada da reserva 1
        System.out.println("Valor a ser pago pelos "
                +teste1.getQuantidadeDias()
                +" dias de duração da reserva: "
                +teste1.calculaDiaria());
        
       System.out.println("----------------------------------------------------------------");
        //cria a segunda reserva teste
        Reserva teste2 = new Reserva(suite2, 10);
        Hospede hosp4 = new Hospede(4, "cesar", "Subura, SN - Roma-IT", 56);
        teste2.incluirHospede(hosp4);
        //mostra não ser possível inserir mais hospedes que a suite comporta
        Hospede hosp5 = new Hospede(5, "cornelia", "Subura, SN - Roma-IT", 25);
        teste2.incluirHospede(hosp5);
        System.out.println("Quantidade de pagantes no quarto: "+teste2.getQuantidadePessoas());
        System.out.println("Lista de hóspedes da "+ teste2.getSuite().getTipo());
        teste2.imprimirHospedes();
        //imprime o valor da diária para os 10 dias de estada da reserva 2, com o desconto aplicado
        System.out.println("Valor a ser pago pelos "
                +teste2.getQuantidadeDias()
                +" dias de duração da reserva: "
                +teste2.calculaDiaria());
    }
}
