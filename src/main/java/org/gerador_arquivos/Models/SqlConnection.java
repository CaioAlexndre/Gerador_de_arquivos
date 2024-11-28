package org.gerador_arquivos.Models;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
//responsabilidade abrir a conexao deve estar separada.
//se for necessario salvar ou carregar banco de dados a partir da classe ArqTxt é recomendavel usar uma camada de serviço ou repositorio.
//estudar serviço e repositorio.

public class SqlConnection
{
    private static final String Url = "jdbc:mysql://localhost:3306/Dbteste";
    private static Connection conexao;

    public static Connection Conectar ()
    {
        try
        {
           conexao = DriverManager.getConnection(Url,"root","");
            System.out.println("conectado");

        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
        return conexao;
    }
    public static void Desconectar ()
    {
        try
        {
            conexao.close();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
