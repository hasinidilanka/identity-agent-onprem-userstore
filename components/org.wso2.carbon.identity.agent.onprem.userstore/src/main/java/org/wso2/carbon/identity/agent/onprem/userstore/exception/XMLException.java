package org.wso2.carbon.identity.agent.onprem.userstore.exception;


public class XMLException extends Exception {
    public XMLException() {
    }

    public XMLException(String message) {
        super(message);
    }

    public XMLException(String message, Throwable cause) {
        super(message, cause);
    }

    public XMLException(Throwable cause) {
        super(cause);
    }
}
