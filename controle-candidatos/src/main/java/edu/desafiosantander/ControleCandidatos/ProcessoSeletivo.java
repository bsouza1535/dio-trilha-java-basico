package edu.desafiosantander.ControleCandidatos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {

        List<String> candidatosSelecionados = new ArrayList<>();
        imprimirSelecionados();
        selecionarCandidatos(candidatosSelecionados);
        
        for (String candidato: candidatosSelecionados){
            entrandoEmContato(candidato);
        }

    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do { 
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            }else{
                System.out.println("CANTATO REALIZADO COM SUCESSO!");
            }
            
        } while (continuarTentando && tentativasRealizadas < 3);
    
        if(atendeu){
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
        }
        else{
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + " NÚMERO MÁXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
        }
    
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){

        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "BRUNO", "MARIANA", "FERNANDO", "WAGNER", "VICTOR", "DANILO"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento: ");

        for (int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de número " + (indice+1) + " é o(a) " + candidatos[indice]);
        }

    }

    static void selecionarCandidatos(List<String> candidatosSelecionados){
       
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "BRUNO", "MARIANA", "FERNANDO", "WAGNER", "VICTOR", "DANILO"};

        int candidatoSelecionado = 0;
        double salarioBase = 2000.0;
        int candidatoVaga = 0;

        while (candidatoSelecionado < 5 && candidatoSelecionado < candidatos.length){

            String candidato = candidatos[candidatoVaga];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou o valor de " + salarioPretendido);
            System.out.println();

            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                candidatoSelecionado++;
                candidatosSelecionados.add(candidato);
                System.out.println();
            }else{
                System.out.println("O candidato " + candidato + " não foi selecionado para a vaga.");
                System.out.println();
            }
            candidatoVaga++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}