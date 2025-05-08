package model;

public interface IAnimal extends Comparable<IAnimal> { //Nomenlatura pra interface é colocar "...avel", mas quando fica estranho é colocado um "I..."
    String TESTE = "teste"; //Método estático

    String emitirSom();
    String andar();
    //String getNome(); Não é uma boa prática!

    default String padrao(){
        return "Método padrão";
    }



}
