package com.maddhacker.ol.serialization.hessian.deserializer;

import org.joda.time.DateTime;

import com.maddhacker.ol.serialization.hessian.JodaConstants;

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
