package ar.com.juanek;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class MySessionBean implements ISessionBean{

    @Autowired
    private HttpSession httpSession;

    @PostConstruct
    public void postConstruct() {
        // do something after the bean has been constructed
    }

    public String getHttpSessionId() {
        return httpSession.getId();
    }
}