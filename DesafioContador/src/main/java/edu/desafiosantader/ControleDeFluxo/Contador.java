package edu.desafiosantader.ControleDeFluxo;

import java.util.Scanner;


public class Contador {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = input.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = input.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e ) {
            System.out.println("O segundo parâmetro digitado deve ser maior que o primeiro!");
		}
	}
	/**
	 * @param parametroUm
	 * @param parametroDois
	 * @throws ParametrosInvalidosException
	 */
	public static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException("Valor inconsistente!");
        }else{
            int contagem = parametroDois - parametroUm;

            for (int i = 0; i < contagem; i++){
                System.out.println("Imprimendo o número " + (i + 1));
            }
        }
	}
}