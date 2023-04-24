package ar.com.juanek;

import org.apache.wicket.protocol.http.WicketFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

@WebFilter(value = "/*", initParams = {
        @WebInitParam(name = "applicationClassName", value = "ar.com.juanek.WicketApplication"),
        @WebInitParam(name = "filterMappingUrlPattern", value = "/*")
})
public class MyFilter extends WicketFilter {
}
