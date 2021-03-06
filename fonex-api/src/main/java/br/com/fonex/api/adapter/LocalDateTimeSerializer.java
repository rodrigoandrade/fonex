package br.com.fonex.api.adapter;

import java.io.IOException;
import java.time.LocalDate;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * @author rodrigo.andrade
 *
 */

public class LocalDateTimeSerializer extends JsonSerializer<LocalDate> {
	
	@Override
	public void serialize(LocalDate localDate, JsonGenerator jsonGenerator, SerializerProvider serializableProvider)
			throws IOException, JsonProcessingException {
		
		jsonGenerator.writeString(localDate.toString());
	}

}