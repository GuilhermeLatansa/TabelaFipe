package br.com.guilherme.TabelaFipe.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
