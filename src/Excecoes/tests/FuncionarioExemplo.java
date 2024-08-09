package Excecoes.tests;

import Excecoes.model.Funcionario;

public class FuncionarioExemplo {
    public static void instanceFuncionario(){
        Funcionario f = Funcionario.from("Joao");
        Funcionario f1 = Funcionario.from("Maria");
        Funcionario f2 = Funcionario.from("Larissa");

        System.out.println(f);
        System.out.println(f1);
        System.out.println(f2);
    }
}
