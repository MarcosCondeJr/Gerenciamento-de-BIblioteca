package principal;

import java.util.Scanner;

public class Principal {
   public static void main(String[] args) {      
        Scanner ent = new Scanner(System.in);
        
        Livro livro1 = new Livro("Essencialismo","GregMckeown", 2015);
        int x;
        System.out.println("------  BIBLIOTECA  -------\n");
        System.out.println("1 - livros\n"
                         + "2 - Alugar\n"
                         + "3 - Devolução\n"
                         + "\nCondição: ");
        x = ent.nextInt();

        switch(x){
             case 1:
                 livro1.exibirDetalhes();
                 System.out.println("Livro emprestado!" + "\n1 - Voltar");
                 x = ent.nextInt();
                 break;
             case 2:
                 livro1.emprestar();
                 break;
             case 3:
                 livro1.devolver();
                 break;
        }
    }
}
