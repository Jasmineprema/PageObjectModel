package jsonOperations;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonWritingThinkwise {

	
	public static void main(String[] args) throws IOException {
		
		
		JSONObject jsonObject = new JSONObject();
		
		jsonObject.put("Name", "Jasmine");
		jsonObject.put("Age", 20);
		
		JSONArray array = new JSONArray();
		array.add("Magical Smile");
		array.add("Magnectic eyes");
		
		jsonObject.put("Qualities", array);
		
		FileWriter fileWriter = new FileWriter("jasmine.json");
		
		fileWriter.write(jsonObject.toJSONString());
		
		fileWriter.close();
		
	
	
	
	
	}
	
}
