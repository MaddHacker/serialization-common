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

import com.sun.jersey.core.provider.AbstractMessageReaderWriterProvider;

@Provider
public class BooleanMessageBodyReaderWriter extends AbstractMessageReaderWriterProvider<Boolean> {

	@Override
	public boolean isReadable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
		return type == Boolean.class;
	}

	@Override
	public Boolean readFrom(Class<Boolean> type, Type genericType, Annotation[] annotations, MediaType mediaType,
			MultivaluedMap<String, String> httpHeaders, InputStream entityStream) throws IOException,
			WebApplicationException {
		return Boolean.parseBoolean(readFromAsString(entityStream, mediaType));
	}

	@Override
	public boolean isWriteable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
		return type == Boolean.class;
	}

	@Override
	public void writeTo(Boolean t, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType,
			MultivaluedMap<String, Object> httpHeaders, OutputStream entityStream) throws IOException,
			WebApplicationException {
		writeToAsString(Boolean.toString(t), entityStream, mediaType);
	}

}
