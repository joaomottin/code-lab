public class Cafeteira {
    public boolean ligado;
    public int qntCafe;
    public int qntAgua;


    public Cafeteira(){
        ligado = false;
        qntAgua = 0;
        qntCafe = 0;
    }

    public void ligar(){
        ligado = true;
    }

    public void desligar(){
        ligado = false;
    }

    public void encherCafe(int qtde){
        if (qtde > 0 && ligado) qntCafe += qtde;
    }

    public void encherAgua(int qtde){
        if(qtde>0&&ligado) qntAgua += qtde;
    }

    public String status(){
        return "A cafeteira está "+((ligado)? "Ligada":"Desligada")+"\nQuantidade de Café "+qntCafe+"g"+"\nQuantidade de Água "+qntAgua+"ml\n";
    }

    public boolean fazerCafe(){
        if(ligado && qntCafe >= 7 && qntAgua >= 30){
            qntAgua -=30;
            qntCafe -=7;
            return true;
        }
        return false;
    }
}
