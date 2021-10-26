import java.util.*;
public class CollectionsCheck {

	public static void main(String args[])
	{
		Platform p1 = new Platform("DASHSD");Platform p2 = new Platform("DASHHD");Platform p3 = new Platform("DASHUHD");
		ItemPlatform i1 =new ItemPlatform(p1);ItemPlatform i2 =new ItemPlatform(p2);ItemPlatform i3 =new ItemPlatform(p3);
		List<ItemPlatform> list = new ArrayList<ItemPlatform>();
		list.add(i1);list.add(i2);list.add(i3);
		sortPlatforms(list);
		System.out.println(list.get(0).getPlatform().mDeviceType);
		System.out.println(list.get(1).getPlatform().mDeviceType);
		System.out.println(list.get(2).getPlatform().mDeviceType);
	}
    public static void sortPlatforms(List<ItemPlatform> list)
    {
        Collections.sort(list, new Comparator<ItemPlatform>()
        {
            @Override
            public int compare (ItemPlatform o1, ItemPlatform o2)
            {
                return (o1.getPlatform().mDeviceType).compareTo(o2.getPlatform().mDeviceType);
            }
        });
    }
}
