package ar.com.juanek;

import org.springframework.web.context.request.RequestContextListener;

import javax.servlet.annotation.WebListener;

@WebListener
public class MyRequestContextListener extends RequestContextListener {}