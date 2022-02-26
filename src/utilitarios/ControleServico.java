package utilitarios;

public class ControleServico {
    private int nome_cliente;
    private int nome_funcionario;
    private int nome_servico;
    private String data_servico;
    private String status_servico;

    /**
     * @return the nome_cliente
     */
    public int getNome_cliente() {
        return nome_cliente;
    }

    /**
     * @param nome_cliente the nome_cliente to set
     */
    public void setNome_cliente(int nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    /**
     * @return the nome_funcionario
     */
    public int getNome_funcionario() {
        return nome_funcionario;
    }

    /**
     * @param nome_funcionario the nome_funcionario to set
     */
    public void setNome_funcionario(int nome_funcionario) {
        this.nome_funcionario = nome_funcionario;
    }

    /**
     * @return the nome_servico
     */
    public int getNome_servico() {
        return nome_servico;
    }

    /**
     * @param nome_servico the nome_servico to set
     */
    public void setNome_servico(int nome_servico) {
        this.nome_servico = nome_servico;
    }

    /**
     * @return the data_servico
     */
    public String getData_servico() {
        return data_servico;
    }

    /**
     * @param data_servico the data_servico to set
     */
    public void setData_servico(String data_servico) {
        this.data_servico = data_servico;
    }

    /**
     * @return the status_servico
     */
    public String getStatus_servico() {
        return status_servico;
    }

    /**
     * @param status_servico the status_servico to set
     */
    public void setStatus_servico(String status_servico) {
        this.status_servico = status_servico;
    }
}
