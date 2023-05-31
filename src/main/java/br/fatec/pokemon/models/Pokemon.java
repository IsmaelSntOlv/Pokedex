package br.fatec.pokemon.models;

public class Pokemon {
    private long id;
    private String name;
    private String type;
    private String subtype;
    private String imagepath;
    private String  evolveto;

    public Pokemon(long id, String name, String type, String subtype, String evolveto, String imagepath){
        this.id=id;
        this.name=name;
        this.type=type;
        this.subtype=subtype;
        this.evolveto=evolveto;
        this.imagepath=imagepath;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public String getEvolveto() {
        return evolveto;
    }

    public void setEvolveto(String evolveto) {
        this.evolveto = evolveto;
    }

    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath;
    }
}
