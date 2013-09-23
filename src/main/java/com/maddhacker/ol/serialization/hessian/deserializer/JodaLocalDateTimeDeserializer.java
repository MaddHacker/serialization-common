package com.maddhacker.ol.serialization.hessian.deserializer;

import org.joda.time.LocalDateTime;

import com.maddhacker.ol.serialization.hessian.JodaConstants;

/**
 * Deserializes LocalDateTime objects in the Joda Time API.
 * 
 */
public class JodaLocalDateTimeDeserializer extends AbstractJodaDeserializer {

	@Override
	public Class<?> getType() {
		return LocalDateTime.class;
	}

	@Override
	protected Object stringToJodaObject(String value) {
		return LocalDateTime.parse(value, JodaConstants.DATE_TIME_FORMATTER);
	}
}
