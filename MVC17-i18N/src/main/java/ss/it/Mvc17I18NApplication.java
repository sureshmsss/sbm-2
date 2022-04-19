package ss.it;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class Mvc17I18NApplication {

	@Bean(name = "localeResolver") // fixed bean Id
	public SessionLocaleResolver createResolver() {
		SessionLocaleResolver resolver = new SessionLocaleResolver();
		resolver.setDefaultLocale(new Locale("en", "US"));
		return resolver;
	}

	@Bean
	public LocaleChangeInterceptor createInterceptor() {
		LocaleChangeInterceptor interceptor = new LocaleChangeInterceptor();
		interceptor.setParamName("lang");// default is locale
		return interceptor;
	}

	public static void main(String[] args) {
		SpringApplication.run(Mvc17I18NApplication.class, args);
	}

}
