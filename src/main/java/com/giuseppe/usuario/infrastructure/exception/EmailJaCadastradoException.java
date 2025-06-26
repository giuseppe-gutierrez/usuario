package com.giuseppe.usuario.infrastructure.exception;

public class EmailJaCadastradoException extends RuntimeException {
    public EmailJaCadastradoException(String mensagem) {
        super(mensagem);
    }

    public EmailJaCadastradoException(String mensagem, Throwable throwable){
      super(mensagem,throwable);
    }
}
