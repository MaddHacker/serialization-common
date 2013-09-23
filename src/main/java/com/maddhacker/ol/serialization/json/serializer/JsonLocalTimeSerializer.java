package com.maddhacker.ol.serialization.json.serializer;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;
import org.joda.time.LocalTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;

public class JsonLocalTimeSerializer extends JsonSerializer<LocalTime> {

	DateTimeFormatter formatter = new DateTimeFormatterBuilder().appendHourOfDay(2).appendLiteral(":")
			.appendMinuteOfHour(2).toFormatter();

	@Override
	public void serialize(LocalTime localTime, JsonGenerator gen, SerializerProvider provider) throws IOException,
			JsonProcessingException {

		gen.writeString(formatter.print(localTime));
	}

}
