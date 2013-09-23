package com.maddhacker.ol.serialization.hessian;

import org.joda.time.DateTime;

/**
 * Deserializes DateTime objects in the Joda Time API.
 * 
 */
public class JodaDateTimeDeserializer extends AbstractJodaDeserializer {

	@Override
	public Class<?> getType() {
		return DateTime.class;
	}

	@Override
	protected Object stringToJodaObject(String value) {
		return DateTime.parse(value, JodaConstants.DATE_TIME_FORMATTER);
	}
}
