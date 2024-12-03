package org.gerador_arquivos.Controllers;

import org.gerador_arquivos.Models.Auth.Register;
import org.gerador_arquivos.Models.Auth.Usuario;
import org.gerador_arquivos.Models.Auth.login;

import java.sql.SQLException;

public class MenuController
{
    public void Menu ()
    {

    }

    public  void Login(String Email,String Senha) throws SQLException {

        login logis = new login();
        logis.LoginComum(Email,Senha);

    }

    public  Usuario Register (String Nome,String Email,String Senha) throws SQLException
    {

        //verifica inicialmente se algum campo está vazio
        if (!Nome.isEmpty() || !Email.isEmpty()||Senha.isEmpty())
        {

            Register registro = new Register();
            return registro.RegisterComumn(Nome,Email,Senha);
        }
        else
        {
            //nega o input e fala o pq
        }

        return Usuario.falha();
    }

    public void  EncerrarMenu()
    {
        throw new RuntimeException();
    }
}
