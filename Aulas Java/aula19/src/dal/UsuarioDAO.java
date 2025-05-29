package dal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import model.Usuario;

public abstract class UsuarioDAO {
    private static final String CAMINHO = "src/dados/usuario";

    public static void salvar(List<Usuario> usuarios) throws IOException{
        File diretorio = new File(CAMINHO);
        diretorio.mkdirs();

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(diretorio + "/usuarios2.ser"))){
            oos.writeObject(usuarios);   
        }
    }

    @SuppressWarnings("unchecked")
    public static List<Usuario> carregar() throws IOException, ClassNotFoundException{
        File arquivo = new File(CAMINHO + "/usuarios.ser");
        if(!arquivo.exists()) return new ArrayList<Usuario>();
        
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivo))){
            return (List<Usuario>) ois.readObject();
        }
    }
}
