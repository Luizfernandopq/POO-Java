package Excecoes.model;

import Excecoes.exeption.DataInvalidaException;

import java.time.LocalDate;

public class Cidadao {
    private String nome;
    private LocalDate dataNascimento;
    private LocalDate dataAgendamento;
    private boolean vacinado;

    public Cidadao(String nome, LocalDate dataNascimento, LocalDate dataAgendamento) throws DataInvalidaException {
        this.nome = nome;

        DataUtil.isDataAntes(dataNascimento);
        this.dataNascimento = dataNascimento;

        DataUtil.isDataDepois(dataAgendamento);
        this.dataAgendamento = dataAgendamento;

        this.vacinado = false;
    }

    public boolean isVacinado() {
        return vacinado;
    }

    public void setVacinado(boolean vacinado) {
        this.vacinado = vacinado;
    }

    public void agendarVacina(LocalDate dataAgendamento) throws DataInvalidaException {
        //TODO
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public int getIdade(){
        return LocalDate.now().getYear() - this.getDataNascimento().getYear();
    }

    public LocalDate getDataAgendamento() {
        return dataAgendamento;
    }
}

