package gergely.urban.bollerbl.app;

import gergely.urban.bollerbl.app.config.AppConfig;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public final class AppSpring {
    private AppSpring() {
    }

    public static void main(String[] args) {
        try (ConfigurableApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class)) {
            App app = appContext.getBean(App.class);
        }
    }
}
