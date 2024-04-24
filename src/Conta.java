class Conta {
    int Numero;
    String Agencia;
    String Nome;
    double Saldo;

    public Conta() {
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }

    public String getAgencia() {
        return Agencia;
    }

    public void setAgencia(String agencia) {
        Agencia = agencia;
    }

    public String getNomeCliente() {
        return Nome;
    }

    public void setNomeCliente(String nomeCliente) {
        if (nomeCliente.length() < 3) {
            System.out.println("Nome inválido, digite um nome com mais de 3 caracteres");
            return;
        }
        Nome = nomeCliente;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }
}
