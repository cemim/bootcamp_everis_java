package part2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {

    public static void main(String[] args) {

        // 1 - NÃO ESQUECER DE BAIXAR O DRIVER PARA O BANCO DE DADOS QUE IRÁ UTILIZAR! (Como demonstrado na parte 1 do curso)

        // 2 - Definir parâmetros para se conectar ao banco de dados MySQL.
        String driver = "mysql";
        String dataBaseAddress = "localhost";
        String dataBaseName = "digital_innovation_one";
        String user = "root";
        String password = "";
        String port = "3306";
        String useTimezone = "true";
        String serverTimezone = "UTC";


        // 3 - Construção da string de conexão.
        //"jdbc:mysql://localhost:3306/digital_innovation_one?useTimezone=true&serverTimezone=UTC"
        String connectionUrl = "jdbc:" + driver + "://" + dataBaseAddress + ":" +
                                port + "/" + dataBaseName + "?useTimezone=" +
                                useTimezone + "&serverTimezone=" + serverTimezone;

        //Carregar a classe específica de implementação do driver na memória da JVM. (A partir da versão JDBC 4 não é mais necessário!!!)
        //Class.forName("com.mysql.jdbc.Driver");

        // 4 - Criar conexão usando o DriverManager, passando como parâmetros a string de conexão, usuário e senha do usuário.
        // O TRY resources apartir do java 7 não precisa fechar a conexão, pois ele fecha automaticamente
        try (Connection conn = DriverManager.getConnection(connectionUrl, user, password)) {
            System.out.println("SUCESSO ao se conectar ao banco MySQL!");
        } catch (SQLException e) {
            System.out.println("FALHA ao se conectar ao banco MySQL!");
            e.printStackTrace();
        }

    }
}
