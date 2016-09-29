package popups.controller;

import popups.view.PopupViewer;

public class Controller
{
	private PopupViewer display;

	public Controller()
	{
		display = new PopupViewer();
	}

	public void start()
	{
		boolean Go = true;
		while(Go)
		if (display.collectUserOption("Do you want to tell me your favorite color?") == 0)
		{	Go = false;
			boolean waitingForColor = true;
			while (waitingForColor)
			{
				String favoriteColor = display.collectResponse("What is your favorite color");
				if (favoriteColor != null)
				{
					if(!favoriteColor.equals("password")){
					display.displayMessage("Your favorite color is " + favoriteColor + ", Mine is Yellow");
					waitingForColor = false;}
					else{display.displayMessage("Super Secret");
					waitingForColor = false;}
				} else
				{
					if (display.collectUserOption("Are you sure you wish to leave?") == 0)
					{
						waitingForColor=false;

					}
				}
			}
		}
		else{if (display.collectUserOption("Are you sure you wish to leave?") == 0){Go=false;}
		}
	}
	/**
	 * Determines if a String is a double
	 * @param potentialValue The String To test
	 * @return if the value is a double or not
	 */
private boolean isDouble(String potentialValue){
	boolean isParseable = false;
	try{
		double test = Double.parseDouble(potentialValue);
		isParseable = true;
	}
	catch(NumberFormatException notDouble){
		display.displayMessage("This is not a double value");
	}
	return isParseable;
}
}
