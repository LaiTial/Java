import java.io.*;


public class Wite {

	public static void main(String[] args) {
		
		String text[] = {"kim", "so", "hei"};
		int check[] = {2, 3, 1};
		
		writeFile("text.txt", check, text);
		readFileLine("text.txt");
		
	}
	
	public static void writeFile(String src, int StoreStage[], String name[]) 
	{
		String store;
		
		try {
			BufferedWriter fill = new BufferedWriter(new FileWriter(src));
			
			for(int i = 0; i < name.length; i++)
			{
				store = name[i] + ", " + StoreStage[i];
				fill.write(store);
				fill.newLine();
			}
			
			fill.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void readFileLine(String src)
	{
        try { 
            String line = ""; 
            BufferedReader br = new BufferedReader(new FileReader(src)); 
    		String text[] = new String[3];
    		String check[] = new String[3];
            
            while((line = br.readLine()) != null) { 
            	text[0] = line.split(", ")[0];
            	check[0] = line.split(", ")[1];
            } 

            br.close(); 
      } catch (IOException e){ 
            e.printStackTrace(); 
      }
	}

}
