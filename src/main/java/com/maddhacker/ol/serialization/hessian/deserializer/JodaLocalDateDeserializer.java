package com.maddhacker.ol.serialization.hessian.deserializer;

import org.joda.time.LocalDate;

import com.maddhacker.ol.serialization.hessian.JodaConstants;

/**
 * Deserializes LocalDate objects in the Joda Time API.
 * 
 */
public class JodaLocalDateDeserializer extends AbstractJodaDeserializer {

	@Override
	public Class<?> getType() {
		return LocalDate.class;
	}

	@Override
	protected Object stringToJodaObject(String value) {
		return LocalDate.parse(value, JodaConstants.DATE_FORMATTER);
	}
}
