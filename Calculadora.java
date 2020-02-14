
public class Calculadora () {
private float numero1;
private float numero2;
private float resultado;

    public Calculadora () {
        
    }



    public float getNumero1 () {
        return numero1;
    }

    public void setNumero1 (float numero) {
        this.numero1 = numero;
    }

    public float getNumero2 () {
        return numero2;
    }

    public void setNumero2 (float numero) {
        this.numero2 = numero;
    }

    public float getResultado () {
        return resultado;
    }

    public void resultado (float n1, float n2) {
        this.numero1 = n1;
        this.numero2 = n2;
        this.resultado = n1+n2;
    }



}