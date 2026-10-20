import com.figuras.modelo.Figura

class Heptagono extends Figura {
    private final double lado

    Heptagono(Map<String, Double> p) {
        super("Heptagono")
        if (p?.lado == null) throw new IllegalArgumentException("Debes enviar 'lado'.")
        lado = p.lado as double
        validarMedida(lado)
    }

    double calcularArea()      { (7 / 4.0) * lado * lado / Math.tan(Math.PI / 7) }
    double calcularPerimetro() { 7 * lado }
}
