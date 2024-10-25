/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibli;

/**
 *
 * @author DELL
 */
public class Professor extends Membro {
    private String departamento;
    public Professor(String nome, String id, int limiteEmprestimos, String departamento) {
        super(nome, id, limiteEmprestimos);
        this.departamento = departamento;
    }
    
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + getNome() + '\'' +
                ", id='" + getId() + '\'' +
                ", departamento='" + getDepartamento() + '\'' +
                ", livrosEmprestados=" + getLivrosEmprestados().size() +
                '}';
    }
}
