package factory;

public class SemContratosFactory extends Factory {
    @Override
    Car retrieveCar(String requestedGrade) {
        switch (requestedGrade) {
            case "A":
                return new Brasilia(60, "Completo", "Amarela");
            case "B":
                return new Chevette(82, "vazio", "Preto");
        }
        return null;
    }
}

