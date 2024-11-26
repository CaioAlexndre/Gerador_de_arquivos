package org.gerador_arquivos.Models.FileHandlers;

public interface IArquivos
{

    public String GerarId(String nome,long DataC);


    public boolean Salvar (String id,String nome,String UsuarioC,String caminho);

    public void Deletar ();
    public void Listar();
    public void Modificar();
    public void Enviar ();
}
