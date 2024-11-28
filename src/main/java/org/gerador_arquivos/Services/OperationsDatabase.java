package org.gerador_arquivos.Services;
import org.gerador_arquivos.Models.*;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class OperationsDatabase
{
    //recebe dados de varios models
    //realizar a operação de salvamento de forma assicronoa.



    public void UpdateWhere() throws SQLException
    {


    }


    public static void InsertWhere(String nome, String email, String id_usuario, int nivel_acesso) throws SQLException
    {
        //PreparedStatement e o que tenho que usar,inves dos statements para evitar slqInjection.
        //PreparedStatement também facilita minha vida,fazendo com que os dados sejam enviados de forma correta.
        // Comando SQL com parâmetros substituídos por "?"
        String comando = "INSERT INTO Usuario (Id_usuario, Nome, Data_cadastro, Nivel_acesso, Email) " +
                "VALUES (?, ?, CURRENT_TIMESTAMP, ?, ?)";

        PreparedStatement ps =  SqlConnection.Conectar().prepareStatement(comando);

        // Definindo os valores dos parâmetros na consulta
        ps.setString(1, id_usuario);
        ps.setString(2, nome);
        ps.setInt(3, nivel_acesso);
        ps.setString(4, email);

        ps.executeUpdate();

        SqlConnection.Desconectar();
    }


    public void DeleteWhere()
    {
        SqlConnection.Conectar();
        SqlConnection.Desconectar();
    }

}
