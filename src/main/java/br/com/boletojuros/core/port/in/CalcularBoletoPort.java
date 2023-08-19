package br.com.boletojuros.core.port.in;

import br.com.boletojuros.core.domain.BoletoCalculado;

import java.time.LocalDate;

public interface CalcularBoletoPort {
    BoletoCalculado executar(String codigo, LocalDate dataPagamento);
}
