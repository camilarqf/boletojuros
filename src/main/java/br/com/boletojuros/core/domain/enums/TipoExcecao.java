package br.com.boletojuros.core.domain.enums;


public enum TipoExcecao {
    BOLETO_INVALIDO {
        @Override
        public String getMensagemErro() {
            return "O boleto encontrado é inválido";
        }
    },
    TIPO_BOLETO_INVALIDO{
        @Override
        public String getMensagemErro() {
            return "Apenas boletos XPTO podem ter os juros calculados";
        }
    },
    BOLETO_NAO_VENCIDO{
        @Override
        public String getMensagemErro() {
            return "O boleto informado ainda não está vencido";
        }
    };

    public abstract String getMensagemErro();
}
