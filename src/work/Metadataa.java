package work;

import java.util.*;

public class Metadataa {

	public String name;
	public String value;
	public List<String> list ;
	
	  public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public List<String> getPreviewInfo() {
	        if (list == null) {
	        	list = new ArrayList<String>();
	        }
	        return this.list;
	    }
public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
Metadataa()
{
	
}
Metadataa(String name,String value)
{
	this.name = name;
	this.value = value;
}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 
}
