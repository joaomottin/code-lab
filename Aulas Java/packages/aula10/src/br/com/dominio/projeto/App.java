package br.com.dominio.projeto;

import view.*;
import model.*;
import controller.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World! - PROJETO");
        View.main(args);
        Model.main(args);
        Controller.main(args);
    }
}
