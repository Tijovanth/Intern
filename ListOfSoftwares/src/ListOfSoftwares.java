import java.util.*;
public class ListOfSoftwares {
	MySoftware softwares = new MySoftware();
	boolean isTrue = true;
	void startApplication(boolean value)
	{
		if(value)
		{
		 try {
	    Scanner scanner = new Scanner(System.in);
		System.out.println("1.Year");
		System.out.println("2.Software");
		System.out.println("3.Exit");
		System.out.println("Enter Your Choice");
		int choice = scanner.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter Year");
			Integer year = scanner.nextInt();
			softwares.getSoftwareList(year);
			break;
		case 2:
			System.out.println("Enter Software");
			String software = scanner.next();
			softwares.getSoftwareYear(software);
			break;
		case 3:
			isTrue = false;
			scanner.close();
			break;
		default:
			System.out.println("Enter The Valid Input");
		}
		}catch(NullPointerException ne)
		{
			System.out.println("Please Enter Input");
		}catch(InputMismatchException im)
		{
			System.out.println("Please Enter Correct Input");
		}finally
		{
			startApplication(isTrue);
		}
		}
	}
	public static void main(String[] args) {
		ListOfSoftwares object = new ListOfSoftwares();
			object.startApplication(object.isTrue);
	}
}

class MySoftware
{
	private Map<Integer,ArrayList<String>> softwareYears = new HashMap<>();
    private ArrayList<String> software2010 = new ArrayList<>();
    private ArrayList<String> software2015 = new ArrayList<>();
    private ArrayList<String> software2016 = new ArrayList<>();
    private ArrayList<String> software2017 = new ArrayList<>();
    private ArrayList<String> software2018 = new ArrayList<>();
    public MySoftware()
    {
    software2010.add("BackBone.js");
    software2010.add("Instagram");
    software2010.add("Buffer");
    software2010.add("Kiwik");
    
    software2015.add("Windows");
    software2015.add("WallMe");
    software2015.add("Unmute");
    
    software2016.add("People");
    software2016.add("Prisma");
    software2016.add("SnowDrop");
    software2016.add("Podwalk");
    
    software2017.add("ArcaOS");
    software2017.add("IOS 11");
    software2017.add("JanusGraph");
    software2017.add("Trophy");
    
    software2018.add("Microsoft Expression Web");
    software2018.add("Amaya");
    software2018.add("Freeway");
    software2018.add("Artisteer");
    software2018.add("Themler");
    
    softwareYears.put(2010,software2010);
    softwareYears.put(2015,software2015);
    softwareYears.put(2016,software2016);
    softwareYears.put(2017,software2017);
    softwareYears.put(2018,software2018);
    }
    public void getSoftwareList(Integer year)
    {
    	if(softwareYears.containsKey(year))
    	{
    		ArrayList<String> tempList = softwareYears.get(year);
    		Iterator<String> itr = tempList.iterator();
    		System.out.println("The Softwares are:");
    		while(itr.hasNext())
    		{
    			System.out.println(itr.next());
    		}
    		System.out.println("=====================================");
    	}else
    	{
    		System.out.println("Enter Correct Year");
    	}
    }
    public void getSoftwareYear(String software)
    {
    	Set<Integer> yearsSet = softwareYears.keySet();
    	Iterator<Integer> itr = yearsSet.iterator();
    	Integer outsideyear = 0;
    	while(itr.hasNext())
    	{
    		Integer year =(Integer) itr.next();
    		if(softwareList(software,year))
    		{
    			outsideyear = year;
    			break;
    		}
    	}
    	if(outsideyear == 0)
    	{
    		System.out.println("Sorry...");
    	}else
    	{
    		System.out.println("That software has been released in "+outsideyear);
    	}
    }
    private boolean softwareList(String software,Integer year)
    {
    	ArrayList<String> tempList = softwareYears.get(year);
    	Iterator<String> itr = tempList.iterator();
		while(itr.hasNext())
		{
			String softwarename = (String) itr.next();
			if(softwarename.equals(software))
			{
				return true;
			}
		}
		return false;
    }
}

//class MyComparator implements Comparator
//{
//	public int compare(Object ob, Object obj)
//	{
//		Integer year = (Integer) ob;
//		Integer anotherYear = (Integer) obj;
//		return year.compareTo(anotherYear);
//	}
//}