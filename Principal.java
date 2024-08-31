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
                    
                    System.out.println("\n1- Voltar   2 - Sair");
                    opcao = ent.nextInt();
                    
                        if (opcao == 1){
                            clear.limpar();
                            tela.telaInicio();
                        }else if(opcao == 2){
                            clear.limpar();
                            System.out.println("Finalizando programa....");
                        }else{
                            clear.limpar();
                            System.out.println("Opção inválida");
                            livro1.exibirDetalhes();
                        }
                    break;
                case 2:
                    clear.limpar();
                    livro1.emprestar();
                    
                    System.out.println("Livro emprestado!\n" + "\n1 - Voltar  2- Sair");
                    
                        if (opcao == 1){
                            clear.limpar();
                            tela.telaInicio();
                        }else if(opcao == 2){
                            clear.limpar();
                            System.out.println("Finalizando programa....");
                        }else{
                            clear.limpar();
                            System.out.println("Opção inválida");
                            livro1.emprestar();
                        }
                    break;
                case 3:
                    clear.limpar();
                    livro1.devolver();
                    
                    System.out.println("Livro Devolvido!\n" + "\n1 - Voltar");
                        
                        if (opcao == 1){
                            clear.limpar();
                            tela.telaInicio();
                        }else if(opcao == 2){
                            clear.limpar();
                            System.out.println("Finalizando programa....");
                        }else{
                            clear.limpar();
                            System.out.println("Opção inválida");
                            livro1.devolver();
                        }
                    break;
            }
        }while (opcao !=4);
    }
}
