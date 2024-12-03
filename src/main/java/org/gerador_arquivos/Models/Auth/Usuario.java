package org.gerador_arquivos.Models.Auth;

import org.gerador_arquivos.Services.OperationsDatabase;
import java.util.UUID;
import java.sql.SQLException;

public class Usuario
{

    public Usuario(String nome,String email) throws SQLException
    {
      //insere os dados no bd.
    }

    public static Usuario falha ()
    {
         throw new RuntimeException();
    }
}
