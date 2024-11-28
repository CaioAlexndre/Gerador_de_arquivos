package org.gerador_arquivos.Models.FileHandlers;
import org.gerador_arquivos.Models.SqlConnection;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;



public class ArqTxt implements IArquivos
{
    protected String Id;
    protected String Nome;
    protected String UsuarioC;
    protected String Caminho;

    public ArqTxt(String nome, String UsuarioC, String caminho)
    {

        this.Nome =nome;
        this.UsuarioC = nome;
        this.Caminho = caminho;

        Date Dates = new Date();

      if(Salvar(GerarId(nome,Dates.getTime()),nome,UsuarioC,caminho))
      {



          System.out.println("operação concluida");
      }
      else
      {
          //throw exception.
          System.out.println("falha");
      }



    }

    public String GerarId(String nome,long DataC)
    {

     String Base = nome+ DataC;
        Random random = new Random();
            String temp = String.valueOf(random.nextLong());
            String end = Base+temp;
            String id = end;
        this.Id = id;

             return id;
    }



    @Override
    public boolean Salvar(String id, String nome, String UsuarioC,String caminho)
    {
        String nome_arquivo = caminho+nome+".txt";
        try
        {
            File Fileobj = new File (nome_arquivo);

            System.out.println("escreva no arquivo");
            FileWriter Writer = new FileWriter(Fileobj);
            Scanner scanner = new Scanner(System.in);
            Writer.write(scanner.nextLine());
            Writer.close();

            System.out.println("Operação concluída");
            System.out.println(id);





            return true;
        }
        catch (IOException e)
        {

            return false;
        }



    }



    public void Deletar (){}
    public void Listar(){}
    public void Modificar(){}
    public void Enviar (){}
}
