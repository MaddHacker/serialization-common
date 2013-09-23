package com.maddhacker.ol.serialization.json.deserializer;

import java.io.IOException;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;
import org.joda.time.LocalTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;

public class JsonLocalTimeDeserializer extends JsonDeserializer<LocalTime> {

	DateTimeFormatter formatter = new DateTimeFormatterBuilder().appendHourOfDay(2).appendLiteral(":")
			.appendMinuteOfHour(2).toFormatter();

	@Override
	public LocalTime deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException,
			JsonProcessingException {
		String text = jp.getText();
		return (text == null) ? null : LocalTime.parse(text, formatter);
	}

}
