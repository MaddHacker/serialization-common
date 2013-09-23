package com.maddhacker.ol.serialization.xml;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.math.BigDecimal;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.Provider;

import com.sun.jersey.core.provider.AbstractMessageReaderWriterProvider;

@Provider
public class BigDecimalMessageBodyReaderWriter extends AbstractMessageReaderWriterProvider<BigDecimal> {

	@Override
	public boolean isReadable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
		return type == BigDecimal.class;
	}

	@Override
	public BigDecimal readFrom(Class<BigDecimal> type, Type genericType, Annotation[] annotations, MediaType mediaType,
			MultivaluedMap<String, String> httpHeaders, InputStream entityStream) throws IOException,
			WebApplicationException {
		return new BigDecimal(readFromAsString(entityStream, mediaType));
	}

	@Override
	public boolean isWriteable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
		return type == BigDecimal.class;
	}

	@Override
	public void writeTo(BigDecimal t, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType,
			MultivaluedMap<String, Object> httpHeaders, OutputStream entityStream) throws IOException,
			WebApplicationException {
		writeToAsString(t.toPlainString(), entityStream, mediaType);
	}
}
