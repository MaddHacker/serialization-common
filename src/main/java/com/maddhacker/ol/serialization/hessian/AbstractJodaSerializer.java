package com.maddhacker.ol.serialization.hessian;

import java.io.IOException;

import com.caucho.hessian.io.AbstractHessianOutput;
import com.caucho.hessian.io.AbstractSerializer;

/**
 * Superclass of serializers of objects in the Joda Time API.
 * 
 */
public abstract class AbstractJodaSerializer extends AbstractSerializer {

	@Override
	public void writeObject(Object obj, AbstractHessianOutput out) throws IOException {
		if (obj == null) {
			out.writeNull();
		} else {
			if (out.addRef(obj)) {
				return;
			}

			Class<?> cl = obj.getClass();

			int ref = out.writeObjectBegin(cl.getName());

			if (ref < -1) {
				out.writeString("value");
				out.writeString(jodaObjectToString(obj));
				out.writeMapEnd();
			} else {
				if (ref == -1) {
					out.writeInt(1);
					out.writeString("value");
					out.writeObjectBegin(cl.getName());
				}

				out.writeString(jodaObjectToString(obj));
			}
		}
	}

	protected abstract String jodaObjectToString(Object obj);
}
