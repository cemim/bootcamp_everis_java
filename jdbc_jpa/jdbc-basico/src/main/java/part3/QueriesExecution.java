package part3;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class QueriesExecution {

    public static void main(String[] args) {

        AlunoDAO alunoDAO = new AlunoDAO();

        // =========================== 1 - Consulta =================================================
        List<Aluno> alunos = alunoDAO.list();

        System.out.println("Consulta:");
        alunos.stream().forEach(System.out::println);


        // ======================= 1.1 - Consulta com filtro ========================================
        Aluno alunoParaConsulta = alunoDAO.getById(1);

        System.out.println("\n\nConsulta com filtro:");
        System.out.println(alunoParaConsulta);


        // =========================== 2 - Inserção =================================================
        Aluno alunoParaInsercao = new Aluno(
                "Matheus",
                43,
                "SP"
        );

//        alunoDAO.create(alunoParaInsercao);
//
//        System.out.println("\n\nConsulta apos insercao:");
//        List<Aluno> alunosInsercao = alunoDAO.list();
//        alunosInsercao.stream().forEach(System.out::println);


        // =========================== 3 - Delete ===================================================
        //alunoDAO.delete(1);


        // =========================== 4 - Atualizar ================================================
        Aluno alunoParaAtualizar = alunoDAO.getById(3);
        alunoParaAtualizar.setNome("Joaquim");
        alunoParaAtualizar.setIdade(18);
        alunoParaAtualizar.setEstado("RS");

        //alunoDAO.update(alunoParaAtualizar);
    }

}


