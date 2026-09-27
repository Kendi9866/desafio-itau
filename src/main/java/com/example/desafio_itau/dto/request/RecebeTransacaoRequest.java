package com.example.desafio_itau.dto.request;

import jakarta.validation.constraints.*;

import java.time.OffsetDateTime;

public record RecebeTransacaoRequest(
        @NotNull
        @PositiveOrZero
        Double valor,
        @NotNull
        @PastOrPresent
        OffsetDateTime dataHora
) {

}
