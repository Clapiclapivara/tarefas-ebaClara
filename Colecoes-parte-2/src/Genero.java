import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Genero {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List <String> nomes = new ArrayList<>();
            List <String> masculinos =  new ArrayList<>();
            List <String> femininos = new ArrayList<>();
            System.out.println("Digite o nome-gênero:(digite 'sair' para encerrar): ");
            while (true) {
                String entrada = scanner.nextLine();
                if (entrada.equalsIgnoreCase("sair")) {
                    break;
                } else {
                    String[] partes = entrada.split("-");
                    if (partes.length == 2) {
                        String nome = partes[0];
                        String genero = partes[1];
                        if (genero.equalsIgnoreCase("M")) {
                            masculinos.add(nome);
                        } else if ( genero.equalsIgnoreCase("F")){
                            femininos.add(nome);
                        }
                    }
                    System.out.println("Masculinos:  " + masculinos.toString());
                    System.out.println("Femininos:   " +femininos.toString());

                }
            }
        }
    }
