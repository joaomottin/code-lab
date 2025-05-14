public final class Gato extends Animal{

public Gato(String nome, String som){
    super(nome, som);
    //super.nome = nome;
}

public String ronronar(){
    return "Ronronado...";
}

@Override
public String toString() {
    return "Gato ["+ super.toString() +"]";
}


}
