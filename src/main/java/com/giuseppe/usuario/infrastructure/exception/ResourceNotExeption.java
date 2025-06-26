package com.giuseppe.usuario.infrastructure.exception;

public class ResourceNotExeption extends RuntimeException {
    public ResourceNotExeption(String mensagem){
        super(mensagem);
    }

    public ResourceNotExeption(String mensagem, Throwable throwable){
        super(mensagem,throwable);
    }

}
