package antonStart.springMVC.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringMVCDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {SpringConfig.class};
    }

    // "/" Говорит о том, что все запросы от пользователя мы отправляем на Dispatcher servlet
    // эквивалентно коду из XML файла:
    //<servlet-mapping>
    //<servlet-name>dispatcher</servlet-name>
    //<url-pattern>/</url-pattern>
    //</servlet-mapping>
    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
