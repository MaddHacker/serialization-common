package com.maddhacker.ol.serialization.hessian;

import org.joda.time.LocalDate;

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
