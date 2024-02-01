/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 *
 * @author Usuario
 */
public class ValidacionTiempoFecha {
    public static void main(String[] args) {
        // Ejemplo de fechas y horas
        LocalDateTime inicio = LocalDateTime.of(2024, 1, 1, 10, 0);
        LocalDateTime fin = LocalDateTime.of(2024, 1, 1, 23, 30);

        // Validar que la fecha de inicio sea anterior a la fecha de fin
        if (inicio.isAfter(fin)) {
            System.out.println("La fecha de inicio no puede ser posterior a la fecha de fin.");
        } else {
            // Calcular la duración entre las dos fechas
            Duration duracion = Duration.between(inicio, fin);
            System.out.println("Duración: " + duracion.toHours() + " horas " + duracion.toMinutesPart() + " minutos");
            System.out.println(fin);
        }
    }
}

