package com.maddhacker.ol.serialization.hessian.deserializer;

import org.joda.time.LocalTime;

import com.maddhacker.ol.serialization.hessian.JodaConstants;

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
