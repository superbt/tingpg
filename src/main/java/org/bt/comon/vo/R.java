package org.bt.comon.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class R<T>  implements Serializable {

    private boolean success = true;
    private String errorCode;
    private String message;
    private T data;

    public static <T> R<T> fail() {
        R<T> response = new R<>();
        response.setSuccess(false);
        return response;
    }

    public static <T> R<T> fail(String errorMessage) {
        R<T> response = new R<>();
        response.setSuccess(false);
        response.setMessage(errorMessage);
        return response;
    }

    public static <T> R<T> fail(String errorCode, String errorMessage) {
        R<T> response = new R<>();
        response.setSuccess(false);
        response.setErrorCode(errorCode);
        response.setMessage(errorMessage);
        return response;
    }


    public static <T> R<T> success(T data) {
        R<T> response = new R<>();
        response.setData(data);
        return response;
    }

    public static <T> R<T> success() {
        R<T> response = new R<>();
        return response;
    }

}
