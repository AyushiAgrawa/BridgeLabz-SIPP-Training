package Day5_WorkshopPrograms;
import java.util.*;

interface NavigationManager{
	void openTab(String tab);
	void goBack();
	void goForward();
	void getcurrentTab();
}

class Browser implements NavigationManager{
    private Stack<String> back = new Stack<>();
    private Stack<String> forward = new Stack<>();
    private String CurrentTab = null;
    
    @Override
	public void openTab(String tab) {
    	if(CurrentTab != null) {
			back.push(CurrentTab);
		}
		CurrentTab = tab;
		forward.clear();
		System.out.println("Open tab: "+ CurrentTab);
	}

	@Override
	public void goBack() {
		if(!back.isEmpty()) {
			forward.push(CurrentTab);
			CurrentTab = back.pop();
			System.out.println("Back to : "+ CurrentTab);
		}
		else {
		    System.out.println("No tabs to go back.");
		}
	}

	@Override
	public void goForward() {
		if(!forward.isEmpty()) {
			back.push(CurrentTab);
			CurrentTab = forward.pop();
			System.out.println("Forward to : "+ CurrentTab);
		}else {
			System.out.println("No tabs to go forward.");
		}
	}

	@Override
	public void getcurrentTab() {
		System.out.println("Current Tab: " + CurrentTab);
	}
	
}

class Mobile extends Browser implements NavigationManager{
	
}

class Desktop extends Browser implements NavigationManager{
	
}
public class WebBrowserTabNavigation {

	public static void main(String[] args) {
		Browser mobile = new Mobile();
		Browser desktop = new Mobile();
		
		System.out.println("Mobile Browser- ");
		mobile.openTab("WhatsApp");
		mobile.openTab("Snapchat");
		mobile.openTab("Game");
		mobile.goBack();
		mobile.goForward();
		mobile.getcurrentTab();
		
		System.out.println();
		
		System.out.println("Desktop Browser- ");
		desktop.openTab("VS CODE");
		desktop.openTab("Eclipse");
		desktop.goBack();
		desktop.goForward();
		desktop.getcurrentTab();
	}

}
