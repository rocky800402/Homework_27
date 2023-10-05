package hw7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;

public class Homework07 {

	public static void main(String[] args) throws Exception {
		getFileInfo();
		randomNum();
		ObjectOut();
		objectIn();

	}

	public static void getFileInfo() throws IOException {
		FileInputStream fis = new FileInputStream(".\\files\\Sample.txt");
		FileInputStream fis2 = new FileInputStream(".\\files\\Sample.txt");
		FileInputStream fis3 = new FileInputStream(".\\files\\Sample.txt");
		InputStreamReader is2 = new InputStreamReader(fis2);
		InputStreamReader is3 = new InputStreamReader(fis3);
		BufferedInputStream bi = new BufferedInputStream(fis);
		BufferedReader br2 = new BufferedReader(is2);
		BufferedReader br3 = new BufferedReader(is3);
		int count1 = 0, count2 = 0, count3 = 0;

		while (bi.read() != -1)
			count1++;

		while (br2.read() != -1)
			count2++;

		while (br3.readLine() != null)
			count3++;

		br3.close();
		br2.close();
		bi.close();
		is3.close();
		is2.close();
		fis3.close();
		fis2.close();
		fis.close();

		System.out.println(count1 + "個位元組");
		System.out.println(count2 + "字元");
		System.out.println(count3 + "列資料");
	}

	public static void randomNum() {
		File outputFile = new File("./files/Data.txt");

		try {
			outputFile.createNewFile();
			FileOutputStream fs = new FileOutputStream(outputFile, true);
			BufferedOutputStream bs = new BufferedOutputStream(fs);
			PrintStream ps = new PrintStream(bs);
			int num = 0;
			for (int i = 0; i < 10; i++) {
				num = (int) (Math.random() * 1000) + 1;
				ps.println(num);
			}
			ps.close();
			bs.close();
			fs.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void copyFile(File intputFile, File outputFile) throws IOException {
		FileReader in = new FileReader(intputFile);
		FileWriter out = new FileWriter(outputFile);
		int i;

		while ((i = in.read()) != -1) {
			out.write(i);
			out.flush();
		}
		in.close();
		out.close();

	}

	public static void ObjectOut() throws IOException {
		File file = new File("C:/data");
		file.mkdirs();
		File file2 = new File(file + "/object.ser");
		Pets[] pets = new Pets[4];
		pets[0] = new Dog("Jake");
		pets[1] = new Dog("Max");
		pets[2] = new Cat("Lola");
		pets[3] = new Cat("Dora");

		FileOutputStream fos = new FileOutputStream(file2);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		for (Object a : pets) {
			oos.writeObject(a);
		}
		oos.close();
		fos.close();
	}

	public static void objectIn() throws Exception {
		File file = new File("C:/data/object.ser");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		System.out.println(file.getName() + "檔案內容如下:");
		System.out.println("-----------------------");
		try {
			while (true) {
				((Pets) ois.readObject()).speak();
			}

		} catch (EOFException e) {

			System.out.println("資料讀取完畢！");
		}
		ois.close();
		fis.close();

	}

}
