package work;

import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class testing1786 {

	public static void main (String ars[])
	{
		List<String> list11 = new ArrayList<>();list11.add("value");
        List<String> list22 = new ArrayList<>();list22.add("value");
		NameValueType1 n1 = new NameValueType1();NameValueType1 n2 = new NameValueType1();
		n1.setName("name");n1.setValue(list11);
		n2.setName("name");n2.setValue(list22);
		List<NameValueType1> list1 = new ArrayList<NameValueType1>();list1.add(n1);
		List<NameValueType1> list2 = new ArrayList<NameValueType1>();list2.add(n2);
		PreviewInfoType1 p1 = new PreviewInfoType1();
		PreviewInfoType1 p2 = new PreviewInfoType1();
		PreviewInfoType1 p3 = new PreviewInfoType1();
		PreviewInfoType1 p4 = new PreviewInfoType1();
		PreviewInfoType1 p5 = new PreviewInfoType1();
		p1.setPreviewDuration("1");p1.setMimeType("mime");p1.setProperties(list1);
		p2.setPreviewDuration("1");p2.setMimeType("mime");p2.setProperties(list1);
		p3.setPreviewDuration("2");p3.setMimeType("mime");p3.setProperties(list2);
		p4.setPreviewDuration("2");p4.setMimeType("mime");p4.setProperties(list2);
		p5.setPreviewDuration("1");p5.setMimeType("mime");p5.setProperties(list1);
		List<PreviewInfoType1> list3 = new ArrayList<>();
		list3.add(p1);
		list3.add(p2);
		list3.add(p3);
		list3.add(p4);
		list3.add(p5);
		System.out.println(list3.size());
		List<PreviewInfoType1> list4 = new ArrayList<>();
		System.out.println(p1.equals(p2));System.out.println(p3.equals(p2));
		
		/*for(int i = 0; i < list3.size() ; i++)
		{
		
			if(i==0)
			{
				list4.add(list3.get(i));
			}
			
			else
			{
				 boolean flag = false;
				for(int j=0; j < list4.size(); j++)
			{
               
				if(list3.get(i).equals(list4.get(j)))
				{
					System.out.println("we are duplicates>>>>"+i+":"+j);
					flag = true;
					break;
				}
			}
				if(flag)
				{
					list4.add(list3.get(i));
				}
			}
		}*/
		System.out.println("Before"+list3);
		list3 = compareList(list3);
		System.out.println("After"+list3);
		
		//list4 = list3.stream().distinct().collect(Collectors.toList());
		/*List<PreviewInfoType1> list5 = new ArrayList<>();
		
		Arrays.asList(list5);
		System.out.println("hello".equals(null));
		//System.out.println(null.equals("hello"));
		
		Map<String, Object> m1 = new HashMap<String, Object>();
		m1.put("name", "value");m1.put("name1", "value1");m1.put("name1", "value1");
		Map<String, Object> m2 = new HashMap<String, Object>();
		m2.put("name", "value");m2.put("name1", "value1");
		
		System.out.println(m1.keySet());System.out.println(m1.values());
		
		System.out.println(m1.keySet().equals(m2.keySet()));
		System.out.println(m1.values().toString().equals(m2.values().toString()));

		Metadata mm1 = new Metadata();Metadata mm2 = new Metadata();
		mm1.setmData(m1);mm2.setmData(m2);
		System.out.println(">>&>>>");
		System.out.println(compareMetadata(mm1, mm2));
		Objects.equals("hello","hello");
		System.out.println(">>>>>");
		System.out.println(areEqual("hello", "hello"));System.out.println(areEqual("a","b"));
		System.out.println(areEqual(1,1));System.out.println(areEqual(1,2));*/
		System.out.println("hahahahaha");
		List<String> listt = new ArrayList<>();
		listt.add("heelo");
		listt.add("i");
		listt.add("name");
		listt.add("heelo");
		listt.add("name");
		listt.add("is");
		listt.add("some");
		listt.add("some");
		listt.add("one");
		listt.add("is");
		compareListString(listt);
		System.out.println(listt);
	}
	
	public static List<PreviewInfoType1> compareList(List<PreviewInfoType1> list)
	{
		for ( int i = 0; i < list.size(); i++ )
        {
            for ( int j = 0; j < list.size(); j++ )
            {
                if ( i == j )
                {
                   continue;
                }
                else if ( list.get( j ).equals( list.get( i ) ) )
                {
                    list.remove( j );
                    j--;
                }
            }
        }
		return list;
		
	}
	public static List<String> compareListString(List<String> list)
	{
		for ( int i = 0; i < list.size(); i++ )
        {
            for ( int j = 0; j < list.size(); j++ )
            {
                if ( i == j )
                {
                   continue;
                }
                else if ( list.get( j ).equals( list.get( i ) ) )
                {
                    list.remove( j );
                    j--;
                }
            }
        }
		return list;
		
	}
	
	 public static  boolean compareMetadata(Metadata m1, Metadata m2)
	    {
	        if(m1 == null || m1.getmData() == null || m2 == null || m2.getmData()==null)
	        {
	          return false;
	        }
	        return  m1.getmData().keySet().equals(m2.getmData().keySet()) &&
	                m1.getmData().values().toString().equals(m2.getmData().values().toString());
	    }
	 private static boolean areEqual(Object o1, Object o2) {
	        if (o1 == o2) {
	            return true;
	        }
	        if (o1 == null) {
	            return false;
	        }
	        return o1.equals(o2);
	    }
}
class Metadata{
	 private Map<String, Object> mData = new HashMap<String, Object>();

	public Map<String, Object> getmData() {
		return mData;
	}

	public void setmData(Map<String, Object> mData) {
		this.mData = mData;
	}
}

class PreviewInfoType1 extends AssetInfoType1{

	public String getPreviewDuration() {
		return previewDuration;
	}
	public void setPreviewDuration(String previewDuration) {
		this.previewDuration = previewDuration;
	}
	public String previewDuration;
	   @Override
	    public boolean equals(Object o) {
	        if (!super.equals(o))
	        {
	            return false;
	        }
	        if (o == null || getClass() != o.getClass())
	        {
	            return false;
	        }

	        PreviewInfoType1 other = (PreviewInfoType1) o;

	        return Objects.equals(previewDuration,other.previewDuration);
	    }
}
class AssetInfoType1{
   public String mimeType;
   public String getMimeType() {
	return mimeType;
}
public void setMimeType(String mimeType) {
	this.mimeType = mimeType;
}
public List<NameValueType1> getProperties() {
	return properties;
}
public void setProperties(List<NameValueType1> properties) {
	this.properties = properties;
}
public List<NameValueType1> properties;
  @Override
    public boolean equals(Object o) {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        AssetInfoType1 other = (AssetInfoType1) o;
        return mimeType.equals(other.mimeType) && cmpprop(properties,other.properties);
    }
  public boolean cmpprop(List<NameValueType1> l1,List<NameValueType1> l2)
  {
	 List<String> ln1 = l1.stream().map(s -> s.getName()).collect(Collectors.toList());
	 List<String> ln2 = l2.stream().map(s -> s.getName()).collect(Collectors.toList());
	 
	 List<Optional<String>> lv1 =l1.stream().map(s -> s.getValue().stream().findFirst()).collect(Collectors.toList());
	 List<Optional<String>> lv2 =l2.stream().map(s -> s.getValue().stream().findFirst()).collect(Collectors.toList());
	 
	 return ln1.equals(ln2) && lv1.equals(lv2);
  }
 
  
}
class NameValueType1{
  protected String name;
    public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<String> getValue() {
	return value;
}
public void setValue(List<String> value) {
	this.value = value;
}
	protected List<String> value;
}
