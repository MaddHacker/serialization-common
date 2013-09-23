package com.maddhacker.ol.serialization.json.deserializer;

import java.io.IOException;
import java.math.BigDecimal;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;

public class JsonBigDecimalDeserializer extends JsonDeserializer<BigDecimal> {

	@Override
	public BigDecimal deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException,
			JsonProcessingException {
		return new BigDecimal(jp.getValueAsDouble());
	}

}
