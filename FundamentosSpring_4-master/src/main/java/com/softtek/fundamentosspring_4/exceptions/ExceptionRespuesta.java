package com.softtek.fundamentosspring_4.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ExceptionRespuesta {
    private LocalDateTime fecha;
    private String mensaje;
    private String detalle;
}
