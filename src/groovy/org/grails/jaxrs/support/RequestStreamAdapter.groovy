package org.grails.jaxrs.support

import java.io.InputStream;
import javax.servlet.ServletInputStream

import org.springframework.mock.web.DelegatingServletInputStream;
import org.springframework.mock.web.MockHttpServletRequest;

class RequestStreamAdapter extends MockHttpServletRequest {

    InputStream stream
    
    String format
    
    RequestStreamAdapter(InputStream stream) {
        this.stream = stream
    }
    
    @Override
    ServletInputStream getInputStream() {
        if (stream instanceof ServletInputStream) {
            return stream
        } else if (stream) {
            return new DelegatingServletInputStream(stream)
        } else {
            return super.getInputStream()
        }
    }

    @Override
    javax.servlet.AsyncContext startAsync(javax.servlet.ServletRequest req, javax.servlet.ServletResponse resp) {
        throw new UnsupportedOperationException("startAsync");
    }
    
    @Override
    boolean isAsyncSupported() {
        throw new UnsupportedOperationException("isAsyncSupported");
    }
    
    @Override
    javax.servlet.http.Part getPart(java.lang.String part) {
        throw new UnsupportedOperationException("getPart");
    }
    
    @Override
    void login(java.lang.String arg0, java.lang.String arg1) {
        throw new UnsupportedOperationException("login");
    }
    
    @Override
    java.util.Collection getParts() {
        throw new UnsupportedOperationException("getParts");
    }
    
    @Override
    void logout() {
        throw new UnsupportedOperationException("logout");
    }
    
    @Override
    javax.servlet.AsyncContext getAsyncContext() {
        throw new UnsupportedOperationException("getAsyncContext");
    }
    
    @Override
    boolean authenticate(javax.servlet.http.HttpServletResponse resp) {
        throw new UnsupportedOperationException("authenticate");
    }
    
    @Override
    javax.servlet.DispatcherType getDispatcherType() {
        throw new UnsupportedOperationException("getDispatcherType");
    }
    
    @Override
    javax.servlet.AsyncContext startAsync() {
        throw new UnsupportedOperationException("startAsync");
    }
    
    @Override
    boolean isAsyncStarted() {
        throw new UnsupportedOperationException("isAsyncStarted");
    }
}
