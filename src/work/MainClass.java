package work;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.stream.Collectors;

public class MainClass {

	public static void main(String args[])
	{
		/*List<AssetSearch> list= new ArrayList<>();
		AssetSearch a1 = new AssetSearch();	AssetSearch a2 = new AssetSearch();	AssetSearch a3 = new AssetSearch();
		a1.setAssetName("movie");a2.setAssetName("preview");a3.setAssetName("preview");
	    Metadataa m1 = new Metadataa("MediaCode","100");
	    Metadataa m2 = new Metadataa("Platform","TVHD");
	    Metadataa m3 = new Metadataa("MediaCode","DASHSD");
	    List<Metadataa> listm = new ArrayList<>();
	    listm.add(m1);listm.add(m2);
	    List<Metadataa> listp = new ArrayList<>();
	    listp.add(m1);listp.add(m3);
	    a1.setMetadata(listm);a2.setMetadata(listp);a3.setMetadata(listp);
	    
	    list.add(a1);list.add(a2);list.add(a3);
	    boolean dashFound = false;
	    List<AssetSearch> listpreview =list.stream().filter(s -> s.assetName.equals("preview")).collect(Collectors.toList());
	    		 
	    for(AssetSearch assetPreview : listpreview)
	    {
	    	List<Metadataa> metadataList = assetPreview.getMetadata();
	    	dashFound = metadataList.stream().anyMatch( s -> s.getName().equals("Platform")||s.getValue().startsWith("DASH"));
	        if(dashFound)
	        {
	        	Metadataa m = metadataList.stream().filter( s-> s.getName().equals("MediaCode")).collect(Collectors.toList()).get(0);
	            m.setValue("500");
	        }
	    }*/
		
		//String s ="[SD,HD]";
		/*String s ="SD";
		String  definition ="NONE";
	    if(s.startsWith("[") && s.endsWith("]"))
	    {
	    	String platforms[] = s.substring(1, s.length() - 1).split(",");
	    	List<String> list = Arrays.asList(platforms);
	    	 if (list.stream().anyMatch(p -> p.equals("UHD"))) {
	 			definition ="UHD";
	 		} else if (list.stream().anyMatch(p -> p.equals("HD"))) {
	 			definition ="HD";
	 		} else if (list.stream().anyMatch(p -> p.equals("SD"))) {
	 			definition ="SD";
	 		}
	    }
	    else{
	    	definition = s;
	    }
	    System.out.println(definition);*/
	   /* Metadataa m = new Metadataa();
		List<String> list = new ArrayList<>();
        list.add("one");	list.add("one");	list.add("one");	
        list.add("two");	list.add("two");	list.add("two");	
        list.add("three");	list.add("three");	list.add("three");	
        list.add("four");	list.add("four");	list.add("four");	
        
        List<String> list1 = m.getPreviewInfo();
        for(String s:list)
        {
        	if(!list1.contains(s)){
        	list1.add(s);
        	}
        }
        
        System.out.println("list : "+list);
        System.out.println("list1 : "+list1);*/
   
       /* 
        List<String> ll= new ArrayList<>();
        String[] straary = {"hello","i","hello","am","okay"};
        List <String> l2 = new ArrayList<>(); 
        l2.addAll(Arrays.asList(straary).stream().distinct().collect(Collectors.toList()));*/
      //  System.out.println(l2);
        
       // Set<T> set = new LinkedHashSet<>();
        
      /*  List<String> s1 = new ArrayList<String>();
        List<String> s2 = new ArrayList<String>();
        Metadataa m1 = new Metadataa(); Metadataa m2 = new Metadataa();
        m1.setList(s1);m2.setList(s2);m1.setName("name");m1.setValue("value");m2.setName("name");m2.setValue("value");
        s1.add("one");	s2.add("one");		
        s1.add("two");	s2.add("two");		
        s1.add("three");	s2.add("three");	
        s1.add("four");	s2.add("four");	
        List<Metadataa> mlist = new ArrayList<Metadataa>();
        mlist.add(m1);mlist.add(m2);
        List<Metadataa> mlist1 = new ArrayList<>();
        System.out.println(">>>>>>mlist"+mlist);*/
        
       /* for(int i=0;i<mlist.size();i++)
        {
        	
        	if(i!= mlist.size()-1)
        	{  
        		if(Objects.equals(mlist.get(i).getList(), mlist.get(i+1).getList()))
        	{
        		System.out.println("we are equal objects");
        			mlist1.add(mlist.get(i));
        	}
        		Metadataa m11= mlist.get(i);
        		if(mlist1.stream().anyMatch(s -> Objects.equals(s.getList(),m11.getList())))
        		{
        			System.out.println("we are equal objects");
        		}
        		
        	}
        }*/
      //  System.out.println("After>>>>>>mlist"+mlist1);
		List<String> list = new ArrayList<>();list.add("value");
		NameValueType n1 = new NameValueType();NameValueType n2 = new NameValueType();
		n1.setName("name");n1.setValue(list);
		n2.setName("name");n2.setValue(list);
		List<NameValueType> list1 = new ArrayList<NameValueType>();list1.add(n1);
		List<NameValueType> list2 = new ArrayList<NameValueType>();list2.add(n2);
		AssetInfoType a1= new AssetInfoType();AssetInfoType a2= new AssetInfoType();
		a1.setMimeType("mime");a1.setProperties(list1);
		a2.setMimeType("mime");a2.setProperties(list2);
		PreviewInfoType p1 = new PreviewInfoType();PreviewInfoType p2 = new PreviewInfoType();PreviewInfoType p3 = new PreviewInfoType();
		p1.setPreviewDuration("1");p1.setAsset(a1);
		p2.setPreviewDuration("1");p2.setAsset(a2);
		p3.setPreviewDuration("2");p3.setAsset(a1);
		List<PreviewInfoType> list3 = new ArrayList<>();
		list3.add(p1);
		list3.add(p2);
		list3.add(p3);
		System.out.println(list3.size());
		int s =list3.size();
		
		/*System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p3));
		System.out.println(p3.equals(p1));*/
		
		/*System.out.println(Objects.equals(p1,p2));
		System.out.println(Objects.equals(p2,p3));
		System.out.println(Objects.equals(p3,p1));*/
		 
		List<PreviewInfoType> list4 = new ArrayList<>();
		//PreviewInfoTypeComparator p = new PreviewInfoTypeComparator();
		/*System.out.println(p.compare(p1,p2));
		System.out.println(p.compare(p2,p3));
		System.out.println(p.compare(p3,p1));*/
		
		for(int i = 0; i < list3.size() ; i++)
		{
		
			if(i==0)
			{
				list4.add(list3.get(i));
			}
			
			else
			{
				for(int j=0; j < list4.size(); j++)
			{

				if(compareObjects(list3.get(i), list4.get(j)))
				{
					System.out.println("we are not duplicates>>>>"+i+":"+j);
					list4.add(list3.get(i));
				}
				
			}
			}
		}
		//System.out.println(compareObjects(p1, p2));
		//System.out.println(compareObjects(p2, p3));
		System.out.println(list4);
		
		Map<String, Object> mData1 = new HashMap<String, Object>();
	mData1.put("name","value");

	Map<String, Object> mData2 = new HashMap<String, Object>();
    mData2.put("name","value");

  
    
	System.out.println(mData1.keySet().equals(mData2.keySet()));
	System.out.println(mData1.values().toString()+" "+mData2.values().toString() +">"+mData1.values().toString().equals(mData2.values().toString()));
	
	/*
	for(PreviewInfoType ppp: list3)
	{
		
	}*/
	System.out.println(">>>>>>>>>>>>"+list3.size());
	List<PreviewInfoType> helo = list3.stream().distinct().collect(Collectors.toList());
	System.out.println(helo);
	System.out.println(p1.equals(p2));
	System.out.println(p2.equals(p3));
/*	for(int i = 0; i < list3.size() ; i++)
	{
	
		if(i==0)
		{
			list4.add(list3.get(i));
		}
		
		else
		{
			for(int j=0; j < list4.size(); j++)
		{

			if(compareObjects(list3.get(i), list4.get(j)))
			{
				System.out.println("we are not duplicates>>>>"+i+":"+j);
				list4.add(list3.get(i));
			}
			
		}
		}
	}*/
	}

    public static boolean compareObjects(PreviewInfoType p11, PreviewInfoType p22)
    {
        if( p11.getPreviewDuration().equals(p22.getPreviewDuration())
                && p11.getAsset().getMimeType().equals(p22.getAsset().getMimeType())
                && compareProperties(p11.getAsset().getProperties(),p22.getAsset().getProperties())
        )
        {
            return false;
        }
        return true;
    }
    public static boolean compareProperties(List<NameValueType> nm1, List<NameValueType> nm2)
    {
        List<String> names1 = nm1.stream().map(var -> var.getName()).collect(Collectors.toList());
        List<String> names2 = nm2.stream().map(var -> var.getName()).collect(Collectors.toList());

        List<Optional<String>> value1 = nm1.stream().map(var -> var.getValue().stream().findFirst()).collect(Collectors.toList());
        List<Optional<String>> value2 = nm2.stream().map(var -> var.getValue().stream().findFirst()).collect(Collectors.toList());

        return names1.equals(names2) && value1.equals(value2);
    }
	
}

class PreviewInfoType extends AssetInfoType{
	    public AssetInfoType asset;
	    public AssetInfoType getAsset() {
			return asset;
		}
		public void setAsset(AssetInfoType asset) {
			this.asset = asset;
		}
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

		        PreviewInfoType other = (PreviewInfoType) o;

		        return this.previewDuration.equals(other.previewDuration);
		    }
}
class AssetInfoType{
	   public String mimeType;
	   public String getMimeType() {
		return mimeType;
	}
	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}
	public List<NameValueType> getProperties() {
		return properties;
	}
	public void setProperties(List<NameValueType> properties) {
		this.properties = properties;
	}
	public List<NameValueType> properties;
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
	        AssetInfoType other = (AssetInfoType) o;
	        return this.mimeType.equals(other.mimeType) && cmpprop(this.properties,other.properties);
	    }
	  public boolean cmpprop(List<NameValueType> l1,List<NameValueType> l2)
	  {
		 List<String> ln1 = l1.stream().map(s -> s.getName()).collect(Collectors.toList());
		 List<String> ln2 = l2.stream().map(s -> s.getName()).collect(Collectors.toList());
		 
		 List<Optional<String>> lv1 =l1.stream().map(s -> s.getValue().stream().findFirst()).collect(Collectors.toList());
		 List<Optional<String>> lv2 =l2.stream().map(s -> s.getValue().stream().findFirst()).collect(Collectors.toList());
		 
		 return ln1.equals(ln2) && lv1.equals(lv2);
	  }
	 
	  
}
class NameValueType{
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
