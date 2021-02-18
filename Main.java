package com.company;

class Persona
{
    private int edad;
    private String name;

    public void setName(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return name;
    }

    public void cumpliranios()
    {
        edad ++;
    }
    public int getEdad()
    {
        return edad;
    }
}


public class Main {

    public static void main(String[] args) {
        Persona panchito = new Persona();
        Persona Lupita = new Persona();

        panchito.setName("Panchito");
        Lupita.setName("Lupita");
        panchito.cumpliranios();
        panchito.cumpliranios();
        panchito.cumpliranios();
        panchito.cumpliranios();
        Lupita.cumpliranios();
        Lupita.cumpliranios();
        System.out.println(panchito.getName() + " tiene " + panchito.getEdad() + " años");
        System.out.println(Lupita.getName() + "tiene " + Lupita.getEdad() + " años");
    }
}

