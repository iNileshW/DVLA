package DVLA.MOT;

import java.util.HashMap;
import java.util.Map;

/**
 * Class for enumerators
 *
 */
public enum FileMimeType_enum 
{
	//File types 
    xls("application/vnd.ms-excel"), 
    csv("text/csv");
	
	//Variable
	private String file_enum_type;
	
	//class with map as 2 file types in enum 
	private static class filetype_in_use{
		static Map<String, FileMimeType_enum> map = new HashMap<String, FileMimeType_enum>();		
	}
	
	//Constructor to allow variable equalization
	FileMimeType_enum(String file_enum_type){
		this.file_enum_type = file_enum_type;
		//Add the file type in map
		filetype_in_use.map.put(file_enum_type,this);
	}
	
	//Method for returning information
	public String getftype() {
		return file_enum_type;
	}
	
	//Method to get Type in use
	public static FileMimeType_enum search(String file_enum_type) {
		FileMimeType_enum File_Type = filetype_in_use.map.get(file_enum_type);
		return File_Type;
	}
	
	
}
