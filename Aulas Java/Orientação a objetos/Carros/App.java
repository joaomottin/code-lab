public class App {
    public static void main (String[] args) throws Exception {
    System.out.println("Hello World!");

        Carro carro1 = new Carro();

        carro1.marca = "Mercedes";
        carro1.modelo = "C180";
        carro1.ligar();
        carro1.andar();

        Carro carro2 = new Carro("BMW", "320i");

        System.out.println("Marca: " + carro1.marca);
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Ligado: " + carro1.ligado);
        System.out.println("Andando: " + carro1.andando);




    }



}
