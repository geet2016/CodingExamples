package work;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Testing1808 {
  public static void main(String args[]){
	  NameValueType2 n1 = new NameValueType2("aa","bd");
	  NameValueType2 n2 = new NameValueType2("ca","bc");
	  NameValueType2 n3 = new NameValueType2("da","bb");
	  NameValueType2 n4 = new NameValueType2("ac","ab");
	  System.out.print("Test has started !!");
	  List<NameValueType2> list = new ArrayList<NameValueType2>();
	  List<String> list2 = list.stream().map(p -> p.getFn()).collect(Collectors.toList());
	  if(list2.stream().anyMatch(l -> l.endsWith("a"))){
		System.out.print("A is here !!");  
	  }
  }
}
class NameValueType2{
	  public String fn; public String getFn() {
		return fn;
	}
	public void setFn(String fn) {
		this.fn = fn;
	}
	public String getLn() {
		return ln;
	}
	public void setLn(String ln) {
		this.ln = ln;
	}
	public String ln;
	  NameValueType2(String fn,String ln)
	  {
		  this.fn =fn;
		  this.ln =ln;
	  }
	}
