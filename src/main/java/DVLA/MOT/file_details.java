package DVLA.MOT;

import java.io.File;

//Plain Old Java Object Class for file details
public class file_details {
//Variables/Properties declaration
	public static String file_name;
	private String file_extn;
	private Long file_size;
	private FileMimeType_enum file_type;
	private car_details car_detail_data;

	//Methods
	public String getfile_Name() {
		return file_name;
	}
	public void setfile_Name(String file_name) {
		this.file_name=file_name;
	}
	public String getfile_extn() {
		return file_extn;
	}
	public void setFile_extn(String file_extn) {
		this.file_name=file_extn;
	}
	public Long getfile_size() {
		return file_size;
	}
	public void setFile_size(Long file_size) {
		this.file_size = file_size;
	}
	public FileMimeType_enum getfile_type() {
		return file_type;
	}
	public void setfile_type(FileMimeType_enum file_type) {
		this.file_type = file_type;
	}

	public car_details getcar_details() {
		return car_detail_data;
	}
	
	public void setcar_details(car_details car_detail_data) {
		this.car_detail_data = car_detail_data;
	}
	
	public static FileMimeType_enum file_extn_type(file_details p) {
		String file_name = p.toString();
		return FileMimeType_enum.search(file_name);
	}
	//Default Constructor
	public file_details() {	}
}
