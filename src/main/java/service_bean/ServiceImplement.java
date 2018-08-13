package service_bean;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import DVLA.MOT.file_details;
import DVLA.MOT.car_details;

public class ServiceImplement implements ServiceInterface{

	private List<file_details> file_detail_list;
	
	@Override
	public List<file_details> get_File_Content(String file_path) {
		file_detail_list = new ArrayList<>();
		try {
		readDirectory(file_path, file_detail_list);
		}
		catch (Exception ex){
			ex.printStackTrace();
		}
		return file_detail_list;
	}
	
	@Override
	public file_details getFile_details(String file_name) {
		file_details file_detail =  file_detail_list.stream().filter(x -> file_name.equals(x.getfile_Name())).findFirst().orElse(null);
		return file_detail;
	}

	public void readDirectory(String file_path, List<file_details> file_detail_list2) throws IOException {
		File path = new File(file_path);
		File[] file_list = path.listFiles();
		if(file_list == null) 
			return;
		for (File p : file_list) {
			if (p.isDirectory()) {
				readDirectory(p.getAbsolutePath(),file_detail_list);
			}
			else { 
				file_details fcd = utility.folder_reader.set_File_details(p);
			}
		}
	}

	@Override
	public car_details getcar_details(String file_name) {
		file_details file_detail =  file_detail_list.stream().filter(x -> file_name.equals(x.getfile_Name())).findFirst().orElse(null);
		return file_detail.getcar_details();
	}
}
