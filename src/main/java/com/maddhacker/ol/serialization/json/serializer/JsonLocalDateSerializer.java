package com.maddhacker.ol.serialization.json.serializer;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;

public class JsonLocalDateSerializer extends JsonSerializer<LocalDate> {

	DateTimeFormatter formatter = new DateTimeFormatterBuilder().appendDayOfMonth(2).appendLiteral("/")
			.appendMonthOfYear(2).appendLiteral("/").appendYear(2, 4).toFormatter();

	@Override
	public void serialize(LocalDate localDate, JsonGenerator gen, SerializerProvider provider) throws IOException,
			JsonProcessingException {

		gen.writeString(formatter.print(localDate));
	}

}
