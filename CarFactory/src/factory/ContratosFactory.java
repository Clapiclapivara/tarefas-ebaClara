package factory;

public class ContratosFactory extends Factory {
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new CorolaCar(100, "Completo", "Azul");
        } else {
             if ("C".equals(requestedGrade))
                return new Fusca(54, "Vazio", "Vermelho");
        }
        return null;
    }
}
