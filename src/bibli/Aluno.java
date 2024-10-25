/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibli;

/**
 *
 * @author DELL
 */
public class Aluno extends Membro {
    
    private String curso;

    public Aluno(String nome, String id, int limiteEmprestimos, String curso) {
        super(nome, id, limiteEmprestimos);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + getNome() + '\'' +
                ", id='" + getId() + '\'' +
                ", curso='" + getCurso() + '\'' +
                ", livrosEmprestados=" + getLivrosEmprestados().size() +
                '}';
    }
}
