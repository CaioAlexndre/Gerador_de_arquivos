package org.gerador_arquivos.Models.Auth;

import org.gerador_arquivos.Services.OperationsDatabase;
import java.util.UUID;
import java.sql.SQLException;

public class Usuario
{



  //  public Usuario (Id_usuario,Nome,Data_cadastro,Nivel_acesso, Email)
   // {


  //  }

    public Usuario(String nome,String email) throws SQLException {
        UUID uuid = UUID.randomUUID();
        String Id =  uuid.toString();
        int nivel_acesso = 3;
        OperationsDatabase.InsertWhere(Id,nome,email,nivel_acesso);
    }
}
