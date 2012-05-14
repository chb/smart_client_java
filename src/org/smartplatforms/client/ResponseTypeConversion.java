package org.smartplatforms.client;

import org.apache.http.HttpEntity;

/**
 *
 * @author nate
 *
 * You will need an instance of an implementation of this interface to build
 */
public interface ResponseTypeConversion {

        SmartResponse responseToObject(HttpEntity entity) throws SmartClientException;

}
