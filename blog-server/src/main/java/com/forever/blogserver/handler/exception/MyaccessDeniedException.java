package com.forever.blogserver.handler.exception;

import org.springframework.security.access.AccessDeniedException;


public class MyaccessDeniedException extends AccessDeniedException {

    /**
     * Constructs an <code>AccessDeniedException</code> with the specified message.
     *
     * @param msg the detail message
     */
    public MyaccessDeniedException(String msg) {
        super(msg);
    }
}
