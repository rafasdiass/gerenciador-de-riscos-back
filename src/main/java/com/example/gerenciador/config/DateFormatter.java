package com.example.gerenciador.config;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.springframework.format.Formatter;
import org.springframework.lang.NonNull;

public class DateFormatter implements Formatter<Date> {

    private final String datePattern;
    private final SimpleDateFormat simpleDateFormat;

    public DateFormatter(String datePattern) {
        this.datePattern = datePattern;
        this.simpleDateFormat = new SimpleDateFormat(datePattern);
        this.simpleDateFormat.setLenient(false);
    }

    @Override
    @NonNull
    public Date parse(@NonNull String text, @NonNull Locale locale) throws ParseException {
        return simpleDateFormat.parse(text);
    }

    @Override
    @NonNull
    public String print(@NonNull Date object, @NonNull Locale locale) {
        return simpleDateFormat.format(object);
    }

    public String getDatePattern() {
        return this.datePattern;
    }
}
