package work;

import java.util.List;

public class AssetSearch {

	public String assetName;
	public List<Metadataa> metadata;
	
	public List<Metadataa> getMetadata() {
		return metadata;
	}
	public void setMetadata(List<Metadataa> metadata) {
		this.metadata = metadata;
	}
	public AssetSearch(String assetName) {
		// TODO Auto-generated constructor stub
		this.assetName = assetName;
	}
	AssetSearch()
	{
		
	}
	public String getAssetName() {
		return assetName;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}
}
