package com.maddhacker.ol.serialization.hessian.serializer;

import org.joda.time.LocalTime;

import com.maddhacker.ol.serialization.hessian.JodaConstants;

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
