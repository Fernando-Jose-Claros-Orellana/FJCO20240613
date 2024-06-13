package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacionesMatematicasFJCOTest {

    @Test
    public void testCalcularRaizCuadrada() {
        OperacionesMatematicasFJCO operaciones = new OperacionesMatematicasFJCO();

        // Caso de prueba: Raíz cuadrada de un número positivo
        double resultado = operaciones.calcularRaizCuadrada(4.0);
        assertEquals(2.0, resultado, 0.0001, "La raíz cuadrada de 4.0 debe ser 2.0");

        // Caso de prueba: Raíz cuadrada de cero
        resultado = operaciones.calcularRaizCuadrada(0.0);
        assertEquals(0.0, resultado, 0.0001, "La raíz cuadrada de 0.0 debe ser 0.0");

        // Caso de prueba: Raíz cuadrada de un número negativo (debe lanzar una excepción)
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            operaciones.calcularRaizCuadrada(-1.0);
        });
        assertEquals("No se puede calcular la raíz cuadrada de un número negativo", exception.getMessage());
    }

}