package com.cartavirtual.andres.cartavirtual;

public class Entidad
{
    private int imgFoto;
    private String titulo;

    public  Entidad(int imgFoto,String titulo)
    {
        this.imgFoto = imgFoto;
        this.titulo = titulo;
    }

    public  int GetImageFoto(){return  imgFoto;}
    public String GetTitulo(){return titulo;}
}
