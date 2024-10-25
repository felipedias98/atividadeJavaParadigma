/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibli;

/**
 *
 * @author DELL
 */
import java.time.LocalDate;
public class Emprestimo {
    private Livro livro;
    private Membro membro;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo(Livro livro, Membro membro) {
        this.livro = livro;
        this.membro = membro;
        this.dataEmprestimo = LocalDate.now();
    }

    public void devolver() {
        this.dataDevolucao = LocalDate.now();
        livro.devolver();
        membro.removerLivro(livro);
    }

    public Livro getLivro() {
        return livro;
    }
    public void setLivro(Livro livro){
        this.livro = livro;
    }
    public Membro getMembro() {
        return membro;
    }
    public void setMembro(Membro membro){
        this.membro = membro;
    }
    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }
    public void setDataEmprestimo(LocalDate dataEmprestimo){
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }
    public void setDataDevolucao(LocalDate dataDevolucao){
        this.dataDevolucao = dataDevolucao;
    }
    @Override
    public String toString() {
        return "Emprestimo{" +
                "livro=" + livro.getTitulo() +
                ", membro=" + membro.getNome() +
                ", dataEmprestimo=" + dataEmprestimo +
                ", dataDevolucao=" + (dataDevolucao != null ? dataDevolucao : "Não devolvido") +
                '}';
    }
}
