import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Matheus Martinelli
 * 07-12-2022
 */
public class DadosConexao {
    private static final String USERNAME = "acerV3";
    private static final String PASSWORD = "mysql";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/banco_funcionarios";
    public static Connection criarConexao() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(DATABASE_URL,USERNAME,PASSWORD);
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection connection = criarConexao();
        if (connection!=null){
            System.out.println("Conexão okay");
            connection.close();
        }
    }
}
