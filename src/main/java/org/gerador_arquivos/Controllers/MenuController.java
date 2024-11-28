package org.gerador_arquivos.Controllers;

import org.gerador_arquivos.Models.Auth.Usuario;

import java.sql.SQLException;

public class MenuController
{
    public void Menu ()
    {

    }

    public  void Login()
    {


    }

    public  void Register (String nome,String Email) throws SQLException {
        Usuario usuario = new Usuario(nome,Email);


    }

    public void  EncerrarMenu()
    {
        throw new RuntimeException();
    }
}
