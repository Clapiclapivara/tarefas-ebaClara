
    public class StatusAluno {

        public static void main(String[] args) {
            int nota1 = 9;
            double nota2 = 8.5;
            int nota3 = 7;
            double nota4 = 6.5;

            double resultado = (nota1 + nota2 + nota3 + nota4) /4 ;

            if (resultado >= 7){
                System.out.println("Aprovado");
            }
            else if (resultado >= 5){
                System.out.println("Em recuperação");
            }else{
                System.out.println("Reprovado");
            }
    }

}

   // int result = (nota1 + nota2 + nota3 + nota4) / 4);