package com.maddhacker.ol.serialization.json.deserializer;

import java.io.IOException;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;

public class JsonLocalDateDeserializer extends JsonDeserializer<LocalDate> {

	DateTimeFormatter formatter = new DateTimeFormatterBuilder().appendDayOfMonth(2).appendLiteral("/")
			.appendMonthOfYear(2).appendLiteral("/").appendYear(2, 4).toFormatter();

	@Override
	public LocalDate deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException,
			JsonProcessingException {
		String text = jp.getText();
		return (text == null) ? null : LocalDate.parse(text, formatter);
	}

}
