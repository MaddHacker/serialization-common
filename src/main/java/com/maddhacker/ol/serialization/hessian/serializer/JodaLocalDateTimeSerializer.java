package com.maddhacker.ol.serialization.hessian.serializer;

import org.joda.time.LocalDateTime;

import com.maddhacker.ol.serialization.hessian.JodaConstants;

/**
 * Serializes LocalDateTime objects in the Joda Time API.
 * 
 */
public class JodaLocalDateTimeSerializer extends AbstractJodaSerializer {

	@Override
	protected String jodaObjectToString(Object obj) {
		return ((LocalDateTime) obj).toString(JodaConstants.DATE_TIME_FORMAT);
	}
}
