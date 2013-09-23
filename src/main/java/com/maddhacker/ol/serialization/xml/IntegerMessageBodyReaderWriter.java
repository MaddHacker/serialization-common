package com.maddhacker.ol.serialization.xml;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.Provider;

import org.apache.commons.lang3.math.NumberUtils;

import com.sun.jersey.core.provider.AbstractMessageReaderWriterProvider;

@Provider
public class IntegerMessageBodyReaderWriter extends AbstractMessageReaderWriterProvider<Integer> {

	@Override
	public boolean isReadable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
		return type == Integer.class;
	}

	@Override
	public Integer readFrom(Class<Integer> type, Type genericType, Annotation[] annotations, MediaType mediaType,
			MultivaluedMap<String, String> httpHeaders, InputStream entityStream) throws IOException,
			WebApplicationException {
		int intVal = NumberUtils.toInt(readFromAsString(entityStream, mediaType), -1);
		return (intVal == -1) ? null : new Integer(intVal);
	}

	@Override
	public boolean isWriteable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
		return type == Integer.class;
	}

	@Override
	public void writeTo(Integer t, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType,
			MultivaluedMap<String, Object> httpHeaders, OutputStream entityStream) throws IOException,
			WebApplicationException {
		writeToAsString(String.valueOf(t), entityStream, mediaType);
	}

}
