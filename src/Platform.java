
public class Platform {
    /**
     * deviceType that this platform should be returned as.
     */
	Platform(String deviceType)
	{
		this.mDeviceType = deviceType;
	}
	public String mDeviceType;

	public String getmDeviceType() {
		return mDeviceType;
	}

	public void setmDeviceType(String mDeviceType) {
		this.mDeviceType = mDeviceType;
	}
	
}
