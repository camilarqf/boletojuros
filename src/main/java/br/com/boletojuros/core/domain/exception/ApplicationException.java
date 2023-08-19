package br.com.boletojuros.core.domain.exception;

import br.com.boletojuros.core.domain.enums.TipoExcecao;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ApplicationException extends RuntimeException{
    private static final long serialVersionUID = -4354308017487677585L;

    private TipoExcecao tipoExcecao;
}
