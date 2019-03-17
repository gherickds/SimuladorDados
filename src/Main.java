import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
                int opcao = 0;
                int lances = 0;
                int d1, d2, d3, d4 = 0;
                ArrayList<Integer> numeros = new ArrayList<>();
                Scanner input = new Scanner(System.in);
                System.out.println("Quantas lances deseja realizar?");
                lances = input.nextInt();
                for (int i = 0; i < lances; i++) {
                    System.out.println("Informe o dado que deseja lançar: \n" +
                            "1 - Dado de 4 lados" +
                            "\n2 - Dado de 6 lados" +
                            "\n3 - Dado de 12 lados" +
                            "\n4 - Dado de 20 lados");/*+
                    "\n5 - Dado de simbolos");*/
                    opcao = input.nextInt();

                    if (opcao == 1) {
                        Random gerador = new Random();
                        for (int x = 0; x < 1; x++) {
                            d1 = gerador.nextInt(4) + 1; //gera um valor de 1 á 4.
                            numeros.add(d1); //adiciona o valor gerado no Arraylist numeros, neste e em todos os casos seguintes.
                        }
                    }
                    if (opcao == 2) {
                        Random gerador2 = new Random();
                        for (int x = 0; x < 1; x++) {
                            d2 = gerador2.nextInt(6) + 1; //gera um valor de 1 á 6.
                            numeros.add(d2);
                        }
                    }
                    if (opcao == 3) {
                        Random gerador3 = new Random();
                        for (int x = 0; x < 1; x++) {
                            d3 = gerador3.nextInt(12) + 1; //gera um valor de 1 á 12.
                            numeros.add(d3);
                        }
                    }
                    if (opcao == 4) {
                        Random gerador4 = new Random();
                        for (int x = 0; x < 1; x++) {
                            d4 = gerador4.nextInt(20) + 1; //gera um valor de 1 á 20.
                            numeros.add(d4);
                        }
                    }
                    // SE A OPÇÃO ESCOLHIDA FOR "0" OU MAIOR QUE "5" OCASIONA ERRO
                    // ENTÃO DECREMENTA 1 DO ÍNDICE PARA IGNORAR O ERRO NA CONTAGEM DE LANCES.
                    while (opcao < 1 || opcao > 4) {
                        i = i - 1;
                        System.out.println("Opção inválida, informe novamente!\n");
                        break;
                    }
                }System.out.println("Os número e/ou simbolos obtidos foram: "+"\n"+numeros); //printa os valores inputados no Arraylist.
            }
        }
