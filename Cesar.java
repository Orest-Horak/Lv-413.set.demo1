package Cesar;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Cesar {

	Map <Character,Integer> map = new HashMap<Character,Integer> ();
	private int key;
	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}
	
	public void readEncryptedFile(String nameOfFile){
		File f=new File(nameOfFile);
		try(FileReader reader = new FileReader(f))
		{
		    char[] buffer = new char[(int)f.length()];
		    buffer = new char[(int)f.length()];
		    reader.read(buffer);
		    Arrays.sort(buffer);
		    int counter = 0;
		    for (int i = 0; i < buffer.length; i++) {
				char c = buffer[i];
				counter++;
				if(i==buffer.length-1){
					map.put(c, counter);
					break;
				}
		    	if(c!=buffer[i+1]){
		    		map.put(c, counter);
		    		counter=0;
		    	}	
			}
		    int maxValue = 0;
		    char c = 0;
		    for (Map.Entry entry : map.entrySet()) {
		    	if (((char)entry.getKey()>'A')&&((char)entry.getKey()<='z')){
		    		System.out.println("Key: " + entry.getKey() + " Value: "+ entry.getValue());
		    	}
		    	if (((int)entry.getValue()>maxValue)
		    			&&((char)entry.getKey()>'A')
		    			&&((char)entry.getKey()<='z')){
					maxValue = (int) entry.getValue();
					c = (char) entry.getKey();
				}
		    }
		    System.out.println("Найчастіше зустрічається буква "+c);
		    if(c<'a'){
		    	key = (int) c - (int) 'E';
		    }else{		    	
		    	key = (int) c - (int) 'e';
		    }
		    System.out.println("Ключ рівний "+key);
		}
		catch(IOException ex){        
		    System.out.println(ex.getMessage());
		}
	}
	public void writeDecryptedFile(String nameOfReadFile, String nameOfWriteFile){
		File f=new File(nameOfReadFile);
		try(FileReader reader = new FileReader(f))
		{
			char[] buffer = new char[(int)f.length()];
		    buffer = new char[(int)f.length()];
		    reader.read(buffer);
		    for (int i = 0; i < buffer.length; i++) {
				if(buffer[i]<'A'){
					
				}else if(buffer[i]<'a'&&((buffer[i]-key)<'A')){
					buffer[i]+=25;
					buffer[i]-=key;
				}else if((buffer[i]-key<'a')&&(buffer[i]>='a')){
					buffer[i]+=25;
					buffer[i]-=key;
				}else{					
					buffer[i]-=key;
				}
			}
		    writer(buffer, nameOfWriteFile);
		}catch(IOException ex){        
		    System.out.println(ex.getMessage());
		    
		}
	}
	public void writer(char[] buffer, String nameOfWriteFile){
		try(FileWriter writer = new FileWriter(nameOfWriteFile, false))
		{
            writer.write(buffer);
            writer.flush();
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 
	}
	
	
}
