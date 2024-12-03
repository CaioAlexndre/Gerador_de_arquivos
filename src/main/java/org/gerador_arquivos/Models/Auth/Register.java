package org.gerador_arquivos.Models.Auth;

import org.gerador_arquivos.Services.OperationsDatabase;

import java.sql.SQLException;
import java.util.UUID;

public class Register
{

    public Usuario RegisterComumn(String Nome,String Email,String password) throws SQLException
    {

        UUID uuid = UUID.randomUUID();
        String Id =  uuid.toString();
        int nivel_acesso = 3;


        Usuario usuario = new Usuario(Nome,Email);
        OperationsDatabase.InsertWhere(Id,Nome,nivel_acesso,Email);

        System.out.println("criado");
        return usuario;
    }

    public void RegisterToken()
    {

    }
}

