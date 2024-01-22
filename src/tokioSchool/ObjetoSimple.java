package tokioSchool;

import java.util.Objects;

public class ObjetoSimple {
    private int numero;
    private String texto;

    public ObjetoSimple(int numero, String texto) {
        this.numero = numero;
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjetoSimple that = (ObjetoSimple) o;
        return numero == that.numero && Objects.equals(texto, that.texto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, texto);
    }

    @Override
    public String toString() {
        return "ObjetoSimple{" +
                "numero=" + numero +
                ", texto='" + texto + '\'' +
                '}';
    }
}
