package com.maddhacker.ol.serialization.hessian;

import org.joda.time.DateTime;

/**
 * Serializes DateTime objects in the Joda Time API.
 * 
 */
public class JodaDateTimeSerializer extends AbstractJodaSerializer {

	@Override
	protected String jodaObjectToString(Object obj) {
		return ((DateTime) obj).toString(JodaConstants.DATE_TIME_FORMAT);
	}
}
