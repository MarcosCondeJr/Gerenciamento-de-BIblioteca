package construtor;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Inicio tela  = new Inicio();
        ClearConsole clear = new ClearConsole();
        Livro livro1 = new Livro("Essencialismo","GregMckeown", 2015);

        int opcao;

        do{
            tela.telaInicio();
            opcao = ent.nextInt();

            switch(opcao){
                case 1:
                    clear.limpar();
                    livro1.exibirDetalhes();

                    System.out.println("\nInsira qualquer número para voltar" +
                                       "\n           4 - Sair");
                    opcao = ent.nextInt();

                        if (opcao == 4){
                            clear.limpar();
                            System.out.println("Finalizando programa....");
                        }else{
                            clear.limpar();
                            tela.telaInicio();
                        }
                    break;
                case 2:
                    clear.limpar();
                    livro1.emprestar();

                    System.out.println("Livro Alugado!\n" +
                                       "\nInsira qualquer número para voltar" +
                                       "\n           4 - Sair");
                    opcao = ent.nextInt();

                        if (opcao == 4){
                            clear.limpar();
                            System.out.println("Finalizando programa....");
                        }else{
                            clear.limpar();
                            tela.telaInicio();
                        }
                    break;
                case 3:
                    clear.limpar();
                    livro1.devolver();

                    System.out.println("Livro Devolvido!\n" +
                                       "\nInsira qualquer número para voltar" +
                                       "\n           4 - Sair");

                        if (opcao == 4){
                            clear.limpar();
                            System.out.println("Finalizando programa....");
                        }else{
                            clear.limpar();
                            tela.telaInicio();
                        }
                    break;
            }
        }while (opcao !=4);
    }
}
