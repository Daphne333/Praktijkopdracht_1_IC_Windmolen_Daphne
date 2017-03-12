package com.windmolenproject.www;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WindmolenSoapBindingImpl implements com.windmolenproject.www.Windmolen {
	public java.lang.String readWindmolen(java.lang.String path) throws java.rmi.RemoteException {
		String line = null;
		String totalline = "";
		try {
			FileReader fr = new FileReader(path);
			BufferedReader textReader = new BufferedReader(fr);

			while ((line = textReader.readLine()) != null) {
				totalline += line;
			}
			textReader.close();
		} catch (IOException e) {
			System.out.println(e.getStackTrace());
		}
		return totalline;
	}

	public java.lang.String createWindmolen(java.lang.String code, java.lang.String type, java.lang.String capaciteit,
			java.lang.String path) throws java.rmi.RemoteException {
		File file = new File(path);
		String sWindmolen = "Code: " + code + ", Type: " + type + ", Capaciteit: " + capaciteit + ";   ";
		try {
			// creates the file
			file.createNewFile();

			// creates a FileWriter Object
			FileWriter writer = new FileWriter(file, true);

			// Writes the content to the file
			writer.write(sWindmolen);
			writer.flush();
			writer.close();
		} catch (IOException e) {
			System.out.println(e.getStackTrace());
		}
		return "De volgende windmolen is aangemaakt: " + sWindmolen;
	}

}
