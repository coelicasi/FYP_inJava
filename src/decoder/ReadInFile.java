package decoder;

import java.io.*;

public class ReadInFile {

	public static void main(String[] args) {
		BufferedReader br = null;
		
		try{
			
			String str;
			br = new BufferedReader(new FileReader("C:\\Users\\Alexandra\\Documents\\Misc\\test1.txt"));
			
			while((str = br.readLine()) != null){
				System.out.println(str);
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(br != null)br.close();
				
			}catch(IOException e){
				e.printStackTrace();
			}
		}

	}

}
