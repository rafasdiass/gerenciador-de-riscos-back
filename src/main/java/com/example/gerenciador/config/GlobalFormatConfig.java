package com.example.gerenciador.config;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.core.convert.converter.Converter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class GlobalFormatConfig implements WebMvcConfigurer {

    @SuppressWarnings("null")
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new LocalDateConverter());
    }

    public static class LocalDateConverter implements Converter<String, LocalDate> {
        @Override
        public LocalDate convert(@SuppressWarnings("null") String source) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.ENGLISH);
            return LocalDate.parse(source, formatter);
        }
    }
}
