/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bibli;

/**
 *
 * @author DELL
 */
public class Bibli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "123456789", 3);
        Livro livro2 = new Livro("1984", "George Orwell", "987654321", 2);
        Membro membro1 = new Aluno("Joao", "001",2,"Ciência da computação");
        Membro membro2 = new Professor("Maria", "002", 1,"TI");
        
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarMembro(membro1);
        biblioteca.adicionarMembro(membro2);
        
        biblioteca.emprestarLivro("123456789", "001");
        biblioteca.emprestarLivro("987654321", "002");
        
        biblioteca.listarEmprestimos();

        biblioteca.devolverLivro("123456789", "001");
        
        biblioteca.listarEmprestimos();
        System.out.println(membro1.toString());
        System.out.println(membro2.toString());
        

    }
    
}
