package com.maddhacker.ol.serialization.hessian.serializer;

import org.joda.time.LocalDate;

import com.maddhacker.ol.serialization.hessian.JodaConstants;

/**
 * Serializes LocalDate objects in the Joda Time API.
 * 
 */
public class JodaLocalDateSerializer extends AbstractJodaSerializer {

	@Override
	protected String jodaObjectToString(Object obj) {
		return ((LocalDate) obj).toString(JodaConstants.DATE_FORMAT);
	}
}
