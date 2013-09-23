package com.maddhacker.ol.serialization.hessian;

import org.joda.time.LocalDateTime;

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
