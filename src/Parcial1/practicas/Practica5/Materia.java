package Parcial1.practicas.Practica5;
public class Materia {
    private Double fisicaCuantica1;
    private Double fisicaCuantica2;
    private Double fisicaCuantica3;
    private Double nanotecnologia1;
    private Double nanotecnologia2;
    private Double nanotecnologia3;
    private Double magiaAvanzada1;
    private Double magiaAvanzada2;
    private Double magiaAvanzada3;
    public Materia() {
    }
    public Double getFisicaCuantica1() {
        return fisicaCuantica1;
    }
    public void setFisicaCuantica1(Double fisicaCuantica1) {
        this.fisicaCuantica1 = fisicaCuantica1;
    }
    public Double getFisicaCuantica2() {
        return fisicaCuantica2;
    }
    public void setFisicaCuantica2(Double fisicaCuantica2) {
        this.fisicaCuantica2 = fisicaCuantica2;
    }
    public Double getFisicaCuantica3() {
        return fisicaCuantica3;
    }
    public void setFisicaCuantica3(Double fisicaCuantica3) {
        this.fisicaCuantica3 = fisicaCuantica3;
    }
    public Double getNanotecnologia1() {
        return nanotecnologia1;
    }
    public void setNanotecnologia1(Double nanotecnologia1) {
        this.nanotecnologia1 = nanotecnologia1;
    }
    public Double getNanotecnologia2() {
        return nanotecnologia2;
    }
    public void setNanotecnologia2(Double nanotecnologia2) {
        this.nanotecnologia2 = nanotecnologia2;
    }
    public Double getNanotecnologia3() {
        return nanotecnologia3;
    }
    public void setNanotecnologia3(Double nanotecnologia3) {
        this.nanotecnologia3 = nanotecnologia3;
    }
    public Double getMagiaAvanzada1() {
        return magiaAvanzada1;
    }
    public void setMagiaAvanzada1(Double magiaAvanzada1) {
        this.magiaAvanzada1 = magiaAvanzada1;
    }
    public Double getMagiaAvanzada2() {
        return magiaAvanzada2;
    }
    public void setMagiaAvanzada2(Double magiaAvanzada2) {
        this.magiaAvanzada2 = magiaAvanzada2;
    }
    public Double getMagiaAvanzada3() {
        return magiaAvanzada3;
    }
    public void setMagiaAvanzada3(Double magiaAvanzada3) {
        this.magiaAvanzada3 = magiaAvanzada3;
    }
    @Override
    public String toString() {
        return "Materias con el Profesor Don Pablo{" +
                "Notas de Fisica Cuantica: " + fisicaCuantica1 + '|' + fisicaCuantica2 + '|' + fisicaCuantica3 +
                ", Notas de Nanotecnologia: " + nanotecnologia1 + '|' + nanotecnologia2 + '|' + nanotecnologia3 +
                ", Notas de Magia Avanzada 1: " + magiaAvanzada1 + '|' + magiaAvanzada2 + '|' + magiaAvanzada3 +
                '}';
    }
}
