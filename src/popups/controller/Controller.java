package popups.controller;

import java.util.ArrayList;
import java.util.List;

import popups.model.Thingy;
import popups.view.PopupViewer;

public class Controller
{
	private PopupViewer display;
	private List<Thingy> thingyList;

	public Controller()
	{
		display = new PopupViewer();
		thingyList = new ArrayList<Thingy>();
	}

	public void start()
	{
		learList();
//		boolean Go = true;
//		while (Go)
//			if (display.collectUserOption("Do you want to tell me your favorite color?") == 0)
//			{
//				Go = false;
//				boolean waitingForColor = true;
//				while (waitingForColor)
//				{
//					String favoriteColor = display.collectResponse("What is your favorite color");
//					if (favoriteColor != null)
//					{
//						if (!favoriteColor.equals("password"))
//						{
//							display.displayMessage("Your favorite color is " + favoriteColor + ", Mine is Yellow");
//							waitingForColor = false;
//						} else
//						{
//							display.displayMessage("Super Secret");
//							waitingForColor = false;
//						}
//					} else
//					{
//						if (display.collectUserOption("Are you sure you wish to leave?") == 0)
//						{
//							waitingForColor = false;
//
//						}
//					}
//				}
//			} else
//			{
//				if (display.collectUserOption("Are you sure you wish to leave?") == 0)
//				{
//					Go = false;
//				}
//			}
	}

	/**
	 * Determines if a String is a double
	 * 
	 * @param potentialValue
	 *            The String To test
	 * @return if the value is a double or not
	 */
	private boolean isDouble(String potentialValue)
	{
		boolean isParseable = false;

		try
		{
			double test = Double.parseDouble(potentialValue);
			isParseable = true;
		} catch (NumberFormatException notDouble)
		{
			display.displayMessage("This is not a double value");
		}
		return isParseable;
	}

	/**
	 * Dererimines if a String is an int
	 * 
	 * @param potentialValue
	 *            The String to test
	 * @return if the value is a int or not
	 */
	private boolean isInteger(String potentialValue)
	{
		boolean isParseable = false;
		try
		{
			int test = Integer.parseInt(potentialValue);
			isParseable = true;
		} catch (NumberFormatException notInt)
		{
			display.displayMessage(notInt.getMessage());
			display.displayMessage("Type in a integer next time");
		}
		return isParseable;

	}
	private void learList(){
		display.displayMessage(thingyList.size()+" Is the size of the list");
		Thingy testThingy = new Thingy();
		thingyList.add(testThingy);
		display.displayMessage(thingyList.size()+"Is the size of the list");
	}
}
