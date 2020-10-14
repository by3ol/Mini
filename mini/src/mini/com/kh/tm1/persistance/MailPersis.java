package mini.com.kh.tm1.persistance;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import javax.swing.JOptionPane;

import mini.com.kh.tm1.model.vo.Person;

public class MailPersis {

	HashMap<String,Person> pMap;
	
	File file;

	
	public MailPersis() {
		pMap=new HashMap<String,Person>();
	
		 file=new File("person.dat");
		
		if(!file.exists()) { //파일이 없으면 
			try {
				file.createNewFile();// 파일 만들
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			if(file.length()==0) { //파일이 있는데 크기가 0인경우
				
			}else { //아닌경우
				
				try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file))){
					
					while(true) {
						Person p=(Person)ois.readObject();
						pMap.put(p.getId(),p);
						
						
					}
					
					
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
			
			
		}
		
		
		
	}//생성자 끝
	
	public void fileSave() {
		
		
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(file))){
		
			for(String name: pMap.keySet()) {
				
				oos.writeObject(pMap.get(name));
				
				
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//------------윤우진 코드 시작 ----------------
	public int idpwCheck(String id, String pw) {
	int result = 0;
		if(!pMap.containsKey(id)) {
		/*	if((pMap.get(id).getPw()).equals(pw)) {
				result = 3;
				return  result;
		}else {
			result = 2;
			return result;
		}
		
	}*/ }else {
		result =1;
		return result;
	}
		return result; 
	
	}
//-------------윤우진 코드 끝----------------
	
}
