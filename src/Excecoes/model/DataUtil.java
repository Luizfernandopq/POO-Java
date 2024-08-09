package Excecoes.model;

import Excecoes.exeption.DataInvalidaException;

import java.time.LocalDate;

public class DataUtil {
    public static boolean isDataAntes(LocalDate data) throws DataInvalidaException {
        if (data.isBefore(LocalDate.now()))
            return true;
        throw new DataInvalidaException("Data não está no passado");
    }

    public static boolean isDataDepois(LocalDate data) throws DataInvalidaException {
        if (data.isAfter(LocalDate.now()))
            return true;
        throw new DataInvalidaException("Data não está no futuro");
    }
}