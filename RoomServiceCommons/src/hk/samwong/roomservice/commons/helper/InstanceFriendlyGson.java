package hk.samwong.roomservice.commons.helper;

import java.lang.reflect.Type;
import java.util.Map.Entry;

import net.sf.javaml.core.Instance;
import net.sf.javaml.core.SparseInstance;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

public class InstanceFriendlyGson {
	public static final Gson gson = new GsonBuilder().registerTypeAdapter(
			Instance.class, new GsonDeserializer()).create();

	private static class GsonDeserializer implements JsonDeserializer<Instance> {
		@Override
		public Instance deserialize(JsonElement jsonElt, Type arg1,
				JsonDeserializationContext arg2) throws JsonParseException {
			SparseInstance sparseInstance = new SparseInstance(-1, -100);
			JsonObject jsonObj = jsonElt.getAsJsonObject();
			for (Entry<String, JsonElement> entry : jsonObj.entrySet()) {
				sparseInstance.put(Integer.parseInt(entry.getKey()), entry
						.getValue().getAsDouble());
			}
			return sparseInstance;
		}
	};
}
