import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Aula 9");
        
        //List<String> arrayList = new ArrayList<>();
        //arrayList.add("Java");
        //arrayList.add("PHP");
        //arrayList.add("C++");
//
//
        //List<String> linkedList = new LinkedList<>();
        //linkedList.add("Java");
        //linkedList.add("PHP");
        //linkedList.add("C++");
//
        //linkedList.replaceAll(elemento -> elemento.equals("C++")? "C#" : elemento);
//
        //linkedList.removeIf(elemento -> elemento.equals("C#"));
        //linkedList.addAll(Arrays.asList("JavaScript","HTML5","CSS3"));
//
        //int[] iterador = {0};
        //linkedList.forEach(e -> System.out.println("ForEach " + iterador[0]++ +" "+ e));
//
        //linkedList.forEach(System.out::println);


        Aluno aluno = new Aluno("Pedro", new ArrayList<>());

        String[] nomesMaterias = {"PHP", "Java", "C++", "HTML5", "CSS3"};

        for (String mat : nomesMaterias){
            //aluno.getMaterias().add(new Materia(mat));
            aluno.addMaterias(new Materia(mat));
        }

        System.out.println(aluno);

        Collections.sort(aluno.getMaterias());

        System.out.println(aluno);

        System.out.println("******************STREAM EM JAVA **************************\n");
            Materia html = aluno.getMaterias()
            .stream()
            .filter(elemento -> elemento.getNome().equals("HTML5"))
            .findFirst()
            .orElse(null);

            System.out.println((html != null)? html : "Matéria não encontrada");

        List<Materia> listaNova = aluno.getMaterias()
        .stream()
        .map(m -> new Materia(m.getNome() + "!"))
        .collect(Collectors.toList());

        System.out.println(listaNova);

        aluno.addMaterias(new Materia("PHP"));

        listaNova = aluno.getMaterias()
        .stream()
        .filter(m -> m.getNome().equals("PHP"))
        .collect(Collectors.toList());

        System.out.println(listaNova);

        System.out.println(aluno.getMaterias()
            .stream()
            .map(Materia::getNome)
            .reduce("Materias:", 
            (novaString, stringIteradora)
            -> novaString + stringIteradora + ",")
        );

        System.out.println("******************SET EM JAVA**************************\n");

        Set<String> hashSet = new HashSet<>();
        hashSet.add("Java");
        hashSet.add("PHP");
        hashSet.add("C++");
        hashSet.add("C#");
        hashSet.add("PHP");
        hashSet.add("HTML5");
        hashSet.add("Java");

        System.out.println(hashSet);
        
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Java");
        linkedHashSet.add("PHP");
        linkedHashSet.add("C++");
        linkedHashSet.add("C#");
        linkedHashSet.add("PHP");
        linkedHashSet.add("HTML5");
        linkedHashSet.add("Java");

        System.out.println(linkedHashSet);
        
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Java");
        treeSet.add("PHP");
        treeSet.add("C++");
        treeSet.add("C#");
        treeSet.add("PHP");
        treeSet.add("HTML5");
        treeSet.add("Java");

        System.out.println(treeSet);














        //Materia html = null;
        //Materia c = null;
//
        //for(Materia mat : aluno.getMaterias()){
        //    if (mat.getNome().equals("HTML5")){
        //        html = mat;
        //    }
        //    if(mat.getNome().equals("c")){
        //        c = mat;
        //    }
        //}
//
        //if(html != null) aluno.getMaterias().remove(html);
        //if(c != null) c.setNome("C#");
//
//
        //System.out.println(aluno.getMaterias().size());
//
        //Materia css = new Materia("CSS3");
        //System.out.println("Possui o objeto "+aluno.getMaterias().contains(c));
        //System.out.println("Possui o objeto "+aluno.getMaterias().contains(css));
//
//
        //aluno.getMaterias().set(2, css);


    }
}
