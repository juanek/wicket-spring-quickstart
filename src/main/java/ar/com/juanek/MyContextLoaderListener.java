package ar.com.juanek;
import javax.servlet.annotation.WebListener;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

@WebListener
public class MyContextLoaderListener extends ContextLoaderListener {

    public MyContextLoaderListener() {
        super(getWebApplicationContext());
    }

    private static WebApplicationContext getWebApplicationContext() {
        AnnotationConfigWebApplicationContext context
                = new AnnotationConfigWebApplicationContext();
        context.scan("ar.com.juanek");
        context.refresh();
        return context;
    }
}