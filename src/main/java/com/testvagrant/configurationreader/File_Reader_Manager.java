package com.testvagrant.configurationreader;

import java.io.IOException;

public class File_Reader_Manager {
	
	private  File_Reader_Manager() {
	}
	
	public static Configuration_Reader get_Instance_Configuration() throws IOException {
		
   Configuration_Reader cr = new Configuration_Reader();
    return cr;
	}

	public  File_Reader_Manager get_Instance_FRM() {
		File_Reader_Manager frm = new File_Reader_Manager();
		return frm;
		
	}
	
	
}
