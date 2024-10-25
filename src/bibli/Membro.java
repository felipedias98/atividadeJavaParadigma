/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibli;

/**
 *
 * @author DELL
 */
import java.util.ArrayList;
import java.util.List;
public class Membro {
    private String nome;
    private String id;
    private int limiteEmprestimos;
    private List<Livro> livrosEmprestados;

    public Membro(String nome, String id, int limiteEmprestimos) {
        this.nome = nome;
        this.id = id;
        this.limiteEmprestimos = limiteEmprestimos;
        this.livrosEmprestados = new ArrayList<>();
    }

    public boolean podeEmprestar() {
        return livrosEmprestados.size() < limiteEmprestimos;
    }

    public void adicionarLivro(Livro livro) {
        if (podeEmprestar()) {
            livrosEmprestados.add(livro);
        }
    }

    public void removerLivro(Livro livro) {
        livrosEmprestados.remove(livro);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getId() {
        return id;
    }
    public void setId(String id){
        this.id = id;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }
    public void setLivrosEmprestados(List<Livro>livrosEmprestados){
        this.livrosEmprestados = livrosEmprestados;
    }

    @Override
    public String toString() {
        return "Membro{" +
                "nome='" + nome + '\'' +
                ", id='" + id + '\'' +
                ", livrosEmprestados=" + livrosEmprestados.size() +
                '}';
    }

}
