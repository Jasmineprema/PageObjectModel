package jsonOperations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class TestDataReadFromJSON {
	
	public static JSONObject getJsonData() throws IOException, ParseException {
//		String path = System.getProperty("user.dir");
//		
//		System.out.println(path);
		
		File filename = new File(System.getProperty("C:\\Users\\Jasmine\\eclipse-workspace\\PageObjectModel\\jasmine.json"));
		
		String json = FileUtils.readFileToString(filename, "UTF-8");
		
		Object object = new JSONParser().parse(json);
		
		JSONObject jsonObject = (JSONObject)object;
		
		return jsonObject;
	}
	
	public static String getTestData(String input) throws IOException, ParseException {
		
		String testdata;
		return testdata = (String) getJsonData().get(input);
	}

}
