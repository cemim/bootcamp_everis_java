package classes;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
/**
 * Script criado para complementar o das aulas de jdbc
 *
 * CREATE TABLE estado (
 *     id INTEGER PRIMARY KEY AUTO_INCREMENT,
 *     nome VARCHAR(80) NOT NULL,
 *     sigla CHARACTER(2) NOT NULL
 * );
 *
 * INSERT INTO estado(nome, sigla) VALUES ('Rio de Janeio', 'RJ');
 * INSERT INTO estado(nome, sigla) VALUES ('Santa Catarina', 'SC');
 * INSERT INTO estado(nome, sigla) VALUES ('São Paulo', 'SP');
 *
 * ALTER TABLE aluno add COLUMN estado_id INTEGER;
 *
 * ALTER TABLE aluno ADD CONSTRAINT FK_estado
 * FOREIGN KEY (estado_id) REFERENCES estado(id);
 *
 * UPDATE aluno SET estado_id = 1;
 *
 *  ALTER TABLE aluno DROP COLUMN estado;
 *
 */

@Entity
public class Estado {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String sigla;

    @OneToMany(
            mappedBy = "estado",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Aluno> alunos = new ArrayList<>();

    public Estado() { }

    public Estado(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public Estado(String nome, String sigla, List<Aluno> alunos) {
        this.nome = nome;
        this.sigla = sigla;
        this.alunos = alunos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return "Estado{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sigla='" + sigla + '\'' +
                ", alunos=" + alunos +
                '}';
    }
}