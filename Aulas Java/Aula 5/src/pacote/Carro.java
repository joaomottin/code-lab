package pacote;

public class Carro {
    public String marca;
    public String modelo;
    public boolean ligado;
    public boolean andando;

public String getMarca(){
    return marca;
}
public String getModelo(){
    return modelo;
}
public boolean isLigado(){
    return ligado;
}
public boolean isAndando(){
    return andando;
}

private void setMarca (String marca){
    this.marca=marca;
}
private void setModelo (String modelo){
    this.modelo=modelo;
}
private void setLigado (boolean ligado){
    this.ligado=ligado;
}
private void setAndando (boolean andando){
    this.andando=andando;
}








}
