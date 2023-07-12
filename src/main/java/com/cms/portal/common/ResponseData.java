package com.cms.portal.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.logging.log4j.ThreadContext;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseData<T> implements Serializable {
    private static final long serialVersionUID = -1953354741201959789L;

    private int status;
    private String error;
    private String path;
    private String clientMessageId;
    private T data;

    public ResponseData<T> success(T data) {
        this.data = data;
        this.status = 200;
        this.path = ThreadContext.get("path");
        this.clientMessageId = ThreadContext.get("clientMessageId");
        return this;
    }

    public ResponseData<T> error(int status, String error,String path) {
        this.status = status;
        this.error = error;
        this.path = path;
        this.clientMessageId = ThreadContext.get("clientMessageId");
        return this;
    }
}
