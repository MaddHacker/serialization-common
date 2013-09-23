package com.maddhacker.ol.serialization.json.deserializer;

import java.io.IOException;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;

public class JsonDateTimeDeserializer extends JsonDeserializer<DateTime> {

	DateTimeFormatter formatter = new DateTimeFormatterBuilder().appendDayOfMonth(2).appendLiteral("/")
			.appendMonthOfYear(2).appendLiteral("/").appendYear(2, 4).appendLiteral(" ").appendHourOfDay(2)
			.appendLiteral(":").appendMinuteOfHour(2).toFormatter();

	@Override
	public DateTime deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		String text = jp.getText();
		return (text == null) ? null : DateTime.parse(text, formatter);
	}

}
