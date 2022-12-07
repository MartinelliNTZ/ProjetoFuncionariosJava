import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * @author Matheus Martinelli
 * 07-12-2022
 */
public class DatabaseMySQL {
    public  void salvarDados(Funcionario funcionario){
        String sql = "INSERT INTO funcionarios VALUES (default,?,?)";
        Connection acesso = null;
        PreparedStatement preparar = null;
        try{
            acesso = DadosConexao.criarConexao();
            preparar = acesso.prepareStatement(sql);
            preparar.setString(1, funcionario.getNome());
            preparar.setFloat(2,funcionario.getSalario());
            preparar.execute();
        }catch ( Exception e){
            System.out.println("Erro ao acessar banco"+e.getMessage());
        }finally {
            try{
                if (preparar!=null) preparar.close();
                if (acesso!=null) acesso.close();
            }catch (Exception e){
                System.out.println("Fim");
            }
        }
    }
}
