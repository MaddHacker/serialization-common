package com.maddhacker.ol.serialization.hessian;

import org.joda.time.LocalDateTime;

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
