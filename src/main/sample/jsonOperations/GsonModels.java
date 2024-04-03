package jsonOperations;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GsonModels {

	public static void main(String[] args) throws IOException {

		String fileName = "C:\\Users\\Jasmine\\eclipse-workspace\\PageObjectModel\\jasmine.json";
		Path path = Paths.get(fileName);

		try (Reader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {

			JsonParser parser = new JsonParser();
			JsonElement tree = parser.parse(reader);

			JsonArray array = tree.getAsJsonArray();

			for (JsonElement element : array) {

				if (element.isJsonObject()) {

					JsonObject object = element.getAsJsonObject();

					System.out.println("********************");
					System.out.println(object.get("UserName").getAsString());
					System.out.println(object.get("Password").getAsString());
				}
			}
		}
	}

}
