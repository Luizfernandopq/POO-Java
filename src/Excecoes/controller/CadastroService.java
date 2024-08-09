package Excecoes.controller;

import Excecoes.exeption.DataInvalidaException;
import Excecoes.model.Cidadao;
import Excecoes.model.Funcionario;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class CadastroService {
    private static List<Funcionario> funcionarios = new ArrayList<Funcionario>();
    public static List<Cidadao> cidadaos = new ArrayList<Cidadao>();

    public static void abertura(){
        System.out.println("Sistema Iniciado");
        Scanner scanner = new Scanner(System.in);
        String opcao = "1";

        while (!Objects.equals(opcao, "0")){
            System.out.println("Selecione uma opção:\n" +
                    "1 Para agendar cidadão\n" +
                    "2 Para cadastrar funcionário\n" +
                    "0 Para sair\n");
            opcao = scanner.nextLine();
            if (Objects.equals(opcao, "1")){
                cadastrarCidadao(scanner);
            }
            else if (Objects.equals(opcao, "2")){
                cadastrarFuncionario(scanner);
            }

        }

    }

    public static void cadastrarCidadao(Scanner scanner){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Insira o nome do cidadão: ");
        String nome = scanner.nextLine();

        System.out.println("Insira a data de nascimento do cidadão: ");
        String dataN = scanner.nextLine();
        String[] valores = dataN.split("/");
        LocalDate dataNascimento = LocalDate.of(Integer.parseInt(valores[2]),
                Integer.parseInt(valores[1]),
                Integer.parseInt(valores[0]));

        System.out.println("Insira a data de agendamento do cidadão: ");
        String dataAgend = scanner.nextLine();
        String[] valores1 = dataAgend.split("/");
        LocalDate dataAgendamento = LocalDate.of(Integer.parseInt(valores1[2]),
                Integer.parseInt(valores1[1]),
                Integer.parseInt(valores1[0]));
        Cidadao c;
        try {
            c = new Cidadao(nome, dataNascimento, dataAgendamento);
        } catch (DataInvalidaException d){
            System.out.println(d);
            return;
        }
        cidadaos.add(c);
        System.out.println("Cidadão Agendado com sucesso");
    }

    public static void cadastrarFuncionario(Scanner scanner){
        //TODO
        System.out.println("Funcionário cadastrado com sucesso");
    }
}
