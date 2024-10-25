/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibli;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author DELL
 */
public class Biblioteca {
    private List<Livro> livros;
    private List<Membro> membros;
    private List<Emprestimo> emprestimos;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.membros = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void adicionarMembro(Membro membro) {
        membros.add(membro);
    }

    public void emprestarLivro(String isbn, String idMembro) {
        Livro livro = encontrarLivroPorIsbn(isbn);
        Membro membro = encontrarMembroPorId(idMembro);

        if (livro != null && membro != null && livro.estaDisponivel() && membro.podeEmprestar()) {
            livro.emprestar();
            membro.adicionarLivro(livro);
            Emprestimo emprestimo = new Emprestimo(livro, membro);
            emprestimos.add(emprestimo);
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("Não foi possível realizar o empréstimo.");
        }
    }

    public void devolverLivro(String isbn, String idMembro) {
        Emprestimo emprestimo = encontrarEmprestimo(isbn, idMembro);
        if (emprestimo != null) {
            emprestimo.devolver();
            emprestimos.remove(emprestimo);
            System.out.println("Livro devolvido com sucesso!");
        } else {
            System.out.println("Empréstimo não encontrado.");
        }
    }

    private Livro encontrarLivroPorIsbn(String isbn) {
        for (Livro livro : livros) {
            if (livro.getIsbn().equals(isbn)) {
                return livro;
            }
        }
        return null;
    }

    private Membro encontrarMembroPorId(String id) {
        for (Membro membro : membros) {
            if (membro.getId().equals(id)) {
                return membro;
            }
        }
        return null;
    }

    private Emprestimo encontrarEmprestimo(String isbn, String idMembro) {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getLivro().getIsbn().equals(isbn) && emprestimo.getMembro().getId().equals(idMembro)) {
                return emprestimo;
            }
        }
        return null;
    }

    public void listarEmprestimos() {
        for (Emprestimo emprestimo : emprestimos) {
            System.out.println(emprestimo);
        }
    }

}
