public class Media {
     private double nota;

     public double getNota() {
        return nota;
    }

    public void setNota(double nota){
            this.nota = nota;
        }


    public static void main(String[] args) {
         int nota1 =9;
         double nota2 = 8.5;
         int nota3= 7;
         double nota4= 6.5;

        nota1 = (nota1 / 4);
        nota2 = (nota2 / 4);
        nota3 = (nota3 / 4);
        nota4 = (nota4 / 4);

        System.out.println("; Média Nota 1: " + nota1);
        System.out.println(" Média Nota 2: " + nota2);
        System.out.println(" Média Nota 3: " + nota3);
        System.out.println(" Média Nota 4: "  + nota4);


    }

}


