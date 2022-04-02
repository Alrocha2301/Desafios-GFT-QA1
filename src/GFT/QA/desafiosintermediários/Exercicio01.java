package GFT.QA.desafiosintermediários;
/*Crie um programa onde você receberá valores inteiros não negativos como entrada.

        Ordene estes valores de acordo com o seguinte critério:

        Primeiro os Pares
        Depois os Ímpares
        Você deve exibir os pares em ordem crescente e na sequência os
        ímpares em ordem decrescente.

        Entrada
        A primeira linha de entrada contém um único inteiro positivo N
        (1 < N < 10000) Este é o número de linhas de entrada que vem logo a seguir.
         As próximas N linhas terão, cada uma delas, um valor inteiro não negativo.

        Saída
        Exiba todos os valores lidos na entrada segundo a ordem apresentada acima.
         Cada número deve ser impresso em uma linha, conforme exemplo de saída abaixo.*/

import java.util.*;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        int N = scan.nextInt();
        for (int i = 0; i < N; i ++) {
            int numero = scan.nextInt();
            if (numero % 2 == 0) {
                pares.add(numero);
            } else {
                impares.add(numero);
            }
        }
        Collections.sort(pares);
        Collections.sort(impares);

        for (int i = 0; i < pares.size(); i++)
            System.out.println(pares.get(i));
        for (int i = (impares.size()-1) ; i >= 0; i--)
            System.out.println(impares.get(i));
    }
}
