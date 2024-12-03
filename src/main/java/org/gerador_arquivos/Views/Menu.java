package org.gerador_arquivos.Views;

import org.gerador_arquivos.Controllers.MenuController;
import org.gerador_arquivos.Services.OperationsDatabase;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu //uma view não pode fazer instancias de um controllador.
    //ela não sabe da sua existencia
    //aparentemente o jeito e usar injeção de dependencias para tentar fazer uma instacia do controllador.
{
    public static boolean ExecutarMenu() throws SQLException {
        System.out.println("|=============================|");
        System.out.println("            bem vindo          ");
        System.out.println("|=============================|");

        System.out.println("Digite 1 para entrar ou 2 para registrar-se");
        Scanner Input = new Scanner(System.in);
        String EntradaUsuario =  Input.next();


        MenuController menuController = new MenuController();
        if( EntradaUsuario.equals("1"))
        {

            System.out.println("insira o Email");
            String Email = Input.next();

            System.out.println("insira Sua senha");
            String Senha = Input.next();

            menuController.Login(Email,Senha);

            return true;

        } else if (EntradaUsuario.equals("2"))
        {

            System.out.println("insira o nome ");
            String nome = Input.next();

            System.out.println("insira o Email");
            String Email = Input.next();

            System.out.println("insira Sua senha");
            String Senha = Input.next();


            System.out.println( menuController.Register(nome,Email,Senha));

            return true;
        }
        else
        {
                menuController.EncerrarMenu();
        }


        return false;
    }
}
