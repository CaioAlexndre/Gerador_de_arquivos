package org.gerador_arquivos.Models.Auth;

import org.gerador_arquivos.Services.OperationsDatabase;

import java.sql.SQLException;
import java.util.Objects;

public class login
{
    public void LoginBd ()
    {

    }

    public void LoginToken()
    {

    }

    public boolean LoginComum(String Email,String Senha) throws SQLException
    {

        String email =  OperationsDatabase.Consultar();
        if(Email.equals(email))
        {
            System.out.println("entrada permitida");
            return true;
        }
        else
        {
            System.out.println("entrada negada");
            return false;
        }

    }
}
