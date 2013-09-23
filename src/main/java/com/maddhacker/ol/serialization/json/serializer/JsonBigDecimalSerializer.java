package com.maddhacker.ol.serialization.json.serializer;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;

public class JsonBigDecimalSerializer extends JsonSerializer<BigDecimal> {

	private static final int DEFAULT_SCALE = 2;
	private static final RoundingMode DEFAULT_ROUNDING_METHOD = RoundingMode.HALF_UP;

	protected int getDefaultScale() {
		return DEFAULT_SCALE;
	}

	protected RoundingMode getDefaultRoundingMode() {
		return DEFAULT_ROUNDING_METHOD;
	}

	/**
	 * Helper to provide consistent scale/{@link RoundingMode} uses scale 2 and
	 * {@link RoundingMode#HALF_UP} by default and calls
	 * {@link #scaleAndRound(BigDecimal, int, RoundingMode)}
	 * 
	 * @param value
	 * @return
	 */
	protected BigDecimal scaleAndRound(BigDecimal value) {
		return scaleAndRound(value, getDefaultScale(), getDefaultRoundingMode());
	}

	/**
	 * Helper to automate scale/rounding. If rate is <code>null</code> returns
	 * <code>null</code>
	 * 
	 * @param value
	 * @param scale
	 * @param mode
	 * @return
	 */
	protected BigDecimal scaleAndRound(BigDecimal value, int scale, RoundingMode mode) {
		return (value == null) ? null : value.setScale(scale, mode);
	}

	@Override
	public void serialize(BigDecimal value, JsonGenerator jgen, SerializerProvider provider) throws IOException,
			JsonProcessingException {
		jgen.writeString(scaleAndRound(value).toPlainString());
	}

}
