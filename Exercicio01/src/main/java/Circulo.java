import java.util.*;
public class Circulo extends FormaGeometrica{
    float pi;
    float raio;

    
    public float calcularArea(float pPi, float pRaio) {
        float resultado = pPi *(pRaio * pRaio);
        return resultado;
    }
    
    
}
