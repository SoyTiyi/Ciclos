package edu.eci.cvds.tdd.aerodescuentos;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Assert;
import org.junit.Test;

public class TarifaTest {
    @Test
    public void calculoTarifaSConDescuentoMenorDeEdad(){
        double valor = CalculadorDescuentos.calculoTarifa(100000, 10, 17);
        Assert.assertTrue(95000==valor);
    }

    @Test
    public void calculoTarifaConDiasDeAnticipacion(){
        double valor = CalculadorDescuentos.calculoTarifa(200000, 25, 30);
        Assert.assertTrue(170000==valor);
    }

    @Test
    public void calculoTarifaConDescuentoMayorDeEdad(){
        double valor = CalculadorDescuentos.calculoTarifa(200000, 10, 66);
        Assert.assertTrue(184000==valor);
    }

    @Test
    public void calculoTarifaSinDescuento(){
        double valor = CalculadorDescuentos.calculoTarifa(300000, 10, 36);
        Assert.assertTrue(300000==valor);
    }

    @Test
    public void calculoConDiasDeAnticipacionNegativos(){
        try{
            double valor = CalculadorDescuentos.calculoTarifa(50000, -10, 17);
            Assert.assertTrue(47500==valor);
        }catch(Exception e){
            fail();
        }
    }

    @Test
    public void calcularConValorBaseNegativo(){
        try{
            double valor = CalculadorDescuentos.calculoTarifa(-50000, 10, 17);
            Assert.assertTrue(valor < 0);
        }catch(Exception e){
            fail();
        }
    }

    @Test
    public void calcularConEdadNegativa(){
        try{
            double valor = CalculadorDescuentos.calculoTarifa(50000, 10, -17);
        }catch(Exception e){
            Assert.assertTrue(true);
        }
    }

    @Test
    public void calcularDiasAnticipadoYMenorDeEdad(){
        double valor = CalculadorDescuentos.calculoTarifa(200000, 25, 16);
        Assert.assertTrue(160000==valor);
    }

    @Test
    public void calcularDiasAnticipadoYMayorDeEdad(){
        double valor = CalculadorDescuentos.calculoTarifa(200000, 25, 68);
        Assert.assertTrue(154000==valor);
    }
    
}