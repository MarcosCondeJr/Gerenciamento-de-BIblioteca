package principal;

import java.util.Scanner;

public class Livro {
    String titulo;
    String autor;
    int ano;
    boolean disponivel;
    
    public Livro(String titulo,String autor,int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.disponivel = true;
    }
    
    public void emprestar(){
        disponivel = false;
    }
    public void devolver(){
        disponivel = true;
    }
    public void exibirDetalhes(){
        System.out.println("\nTitulo: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Ano: "+ano);
        System.out.println("Disponivel: "+disponivel);
    }
    public void telaInicial(){
        Scanner ent = new Scanner(System.in);
        int x;
        System.out.println("------  BIBLIOTECA  -------\n");
        System.out.println("1 - livros\n"
                         + "2 - Alugar\n"
                         + "3 - Devolução\n"
                         + "\nCondição: ");
        x = ent.nextInt();
    }
}
