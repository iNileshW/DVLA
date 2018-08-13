package utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.activation.MimetypesFileTypeMap;

import DVLA.MOT.FileMimeType_enum;
import DVLA.MOT.car_details;
import DVLA.MOT.file_details;

public final class folder_reader {

	public static file_details set_File_details(File file) throws IOException {
		file_details Details = new file_details();
		Details.setfile_Name(file.getName());
		Details.setFile_size(file.length());
		String File_type = (new MimetypesFileTypeMap().getContentType(file));
		try {
			Details.setfile_type(FileMimeType_enum.search(File_type));
		}
		catch(IllegalStateException e){
			e.printStackTrace();
			return null;
		}
		String extn = "";
		int i = file.getName().lastIndexOf('.');
		if(i>0) {
			extn = file.getName().substring(i+1);
		}
		Details.setFile_extn(extn);
		
		car_details c = set_details(file);
		if(c == null) {
			return null;
		}
		Details.setcar_details(c);
		return Details;		
	}

	private static car_details set_details(File file) throws IOException {
		Scanner scan = new Scanner(file);
		String line = "";
		String[] info;
		if (scan.hasNext()) {
			info=line.split(",");
		}
		else {
			info = line.split("\\s+");
		}
		car_details car_details = new car_details();
		if(info.length!=3) {
			return null;
		}
		car_details.setcar_reg(info[0].toUpperCase().trim());
		car_details.setcar_make(info[1].toUpperCase().trim());
		car_details.setcar_colour(info[2].toUpperCase().trim());
		return car_details;
	}
}