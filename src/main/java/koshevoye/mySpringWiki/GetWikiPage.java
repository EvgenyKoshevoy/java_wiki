package koshevoye.mySpringWiki;

public class GetWikiPage {
	
	private final String pathToPage;
	
	public GetWikiPage(String pathToPage) {
		this.pathToPage = pathToPage;
	}
	
	public String getPathToPage() {
		return pathToPage;
	}
}
