package com.maddhacker.ol.serialization.hessian;

import org.joda.time.LocalTime;

/**
 * Deserializes LocalTime objects in the Joda Time API.
 * 
 */
public class JodaLocalTimeDeserializer extends AbstractJodaDeserializer {

	@Override
	public Class<?> getType() {
		return LocalTime.class;
	}

	@Override
	protected Object stringToJodaObject(String value) {
		return LocalTime.parse(value, JodaConstants.TIME_FORMATTER);
	}
}
