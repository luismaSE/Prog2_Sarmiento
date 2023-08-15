package E1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Servicio_E1 {

    @Autowired
    private ConfigProperties configProperties;

    public int calcularPotencia(int numero, int exponente ) {
        return (int) Math.pow(numero,exponente);
    }

    public int calcularPotenciaD(int numero) {
        return (int) Math.pow(numero,this.configProperties.getExponenteD());
    }

    public double calcularRaiz(int numero, int raiz){
        return (double) Math.pow(numero, 1.0/raiz);
    }

    public double calcularRaizD(int numero){
        return (double) Math.pow(numero, 1.0/this.configProperties.getRaizD());
    }

}
