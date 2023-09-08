package com.lucumt.filter;

import org.slf4j.MDC;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Order(0)
@Component
@WebFilter(filterName = "traceIdFilter", urlPatterns = "/*")
public class TraceIdFilter implements Filter {

    public static final String TRACE_ID = "TRACE_ID";
    public static final String TRACE_ID_HEADER = "trace-id";

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        String traceId = request.getHeader(TRACE_ID_HEADER);
        MDC.put(TRACE_ID, traceId);
        chain.doFilter(req, res);
    }

    @Override
    public void destroy() {
        MDC.clear();
    }

}
