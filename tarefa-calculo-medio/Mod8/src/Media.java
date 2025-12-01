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

        System.out.println("média total:" + (nota1 + nota2 + nota3 + nota4) / 4);


    }

}


