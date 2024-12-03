package org.gerador_arquivos.Services;
import com.mysql.cj.protocol.Resultset;
import org.gerador_arquivos.Models.*;
import org.gerador_arquivos.Models.Auth.Usuario;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OperationsDatabase
{
    //recebe dados de varios models
    //realizar a operação de salvamento de forma assicronoa.



    public void UpdateWhere() throws SQLException
    {


    }

    public static String Consultar() throws SQLException
    {


        String comando =  "SELECT *FROM Usuario";

        Statement ps = SqlConnection.Conectar().prepareStatement(comando);

        // Estabelecendo conexão com o banco de dados
        try (Connection conexao = SqlConnection.Conectar();
             Statement stmt = conexao.createStatement();
             ResultSet resultado = stmt.executeQuery(comando))
        {


        while (resultado.next())
        {
            String id = resultado.getString("Id_usuario");
            String nome = resultado.getString("Nome");
            String email = resultado.getString("Email");
            System.out.println("ID: " + id + ", Nome: " + nome + ", Email: " + email);



          return email;
        }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return "s";
    }


    public static void InsertWhere(String id_usuario, String nome, int nivel_acesso, String email ) throws SQLException
    {

        //PreparedStatement e o que tenho que usar,inves dos statements para evitar slqInjection.
        //PreparedStatement também facilita minha vida,fazendo com que os dados sejam enviados de forma correta.2
        // Comando SQL com parâmetros substituídos por "?"
        String comando = "INSERT INTO Usuario (Id_usuario, Nome, Data_cadastro, Nivel_acesso, Email) VALUES (?, ?, CURRENT_TIMESTAMP, ?, ?)";

        PreparedStatement ps =  SqlConnection.Conectar().prepareStatement(comando);

        // Definindo os valores dos parâmetros na consulta
        ps.setString(1, id_usuario);
        ps.setString(2, nome);
        ps.setInt(3, nivel_acesso);
        ps.setString(4, email);

        ps.execute();
        ps.close();
        SqlConnection.Desconectar();
    }


    public void DeleteWhere()
    {
        SqlConnection.Conectar();
        SqlConnection.Desconectar();
    }

}
