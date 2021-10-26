
import java.util.*;

/**
 *
 */
public class ItemPlatform 
{
	ItemPlatform(Platform platform)
	{
		this.mPlatform = platform;
	}
    private Platform mPlatform ;
    /** An ItemPlatform may have more more than one PlatformPricing since there
     * will be multiple time intervals in a platform. */
    public Platform getPlatform()
    {
        return mPlatform;
    }

}
