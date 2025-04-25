package br.com.dominio.projeto;

import view.*;
import controller.*;
import model.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World! MAIN");
        View.main(args);
        Model.main(args);
        Controller.main(args);
    }
}
