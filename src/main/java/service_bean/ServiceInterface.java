package service_bean;
import DVLA.MOT.car_details;
import DVLA.MOT.file_details;
import java.util.List;

public interface ServiceInterface {
public List<file_details> get_File_Content(String file_path);
public file_details getFile_details(String file_name);
public car_details getcar_details(String file_name);
}
