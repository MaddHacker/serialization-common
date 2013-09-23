package com.maddhacker.ol.serialization.hessian;

import org.joda.time.LocalTime;

/**
 * Serializes LocalTime objects in the Joda Time API.
 * 
 */
public class JodaLocalTimeSerializer extends AbstractJodaSerializer {

	@Override
	protected String jodaObjectToString(Object obj) {
		return ((LocalTime) obj).toString(JodaConstants.TIME_FORMAT);
	}
}
