import java.util.*;

public class NomePessoas {

    public static void main (String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<String> lista=new ArrayList<>();

        System.out.println("Digite os nomes:(digite 'sair' para encerrar): ");
    while (true) {
        String nome =  scanner.next();
        if(nome.equalsIgnoreCase("sair")){
            break;
        }
        lista.add(nome);
    }
    Collections.sort(lista);
    System.out.println("Lista ordenada" + lista);
    scanner.close();
    }

}