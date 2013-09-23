package com.maddhacker.ol.serialization.hessian.serializer;

import org.joda.time.DateTime;

import com.maddhacker.ol.serialization.hessian.JodaConstants;

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
