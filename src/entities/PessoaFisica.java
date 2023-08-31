package entities;

public class PessoaFisica extends Contribuinte {
    private String cpf;

    public PessoaFisica(String nome, double rendaBruta, String cpf) {
        super(nome, rendaBruta);
        this.cpf = cpf;
    }

    @Override
    public double calcularImposto() {
        if (rendaBruta <= 1903.98) {
            return 0;
        } else if (rendaBruta <= 2826.65) {
            return rendaBruta * 0.075 - 142.80;
        } else if (rendaBruta <= 3751.05) {
            return rendaBruta * 0.15 - 354.80;
        } else if (rendaBruta <= 4664.68) {
            return rendaBruta * 0.225 - 636.13;
        } else {
            return rendaBruta * 0.275 - 869.36;
        }
    }

    @Override
    public String toString() {
        return "Pessoa Física - Nome: " + nome + ", CPF: " + cpf;
    }
}