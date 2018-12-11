
//Please complete and revise this program as needed with comments. 
public class StopWatchTester {

	public static void main(String[] args) {
		 
		int[] massiveArray = new int[100000];
		
		 for(int i = 0; i<massiveArray.length; i++)
		 {
			 massiveArray[i] = (int)(Math.random()*100000);
		 }	 
		 
		 StopWatch sw = new StopWatch();
		 selectionSort(massiveArray);
		 sw.stop();
		 System.out.println(" the massive Array sorting time is " + sw.getElapsedTime());
	}
	
	public static void  selectionSort(int[] massiveArray) {
		
		for(int i = 0 ; i < massiveArray.length-1;i++ )
		{
			int currentMin = massiveArray[i];
		    int currentMinIndex = i;
		  /**  
		    for(int j = i + 1; j <massiveArray.length; j++)
		    {
		    	if(currentMin > massiveArray[j])
		    	{
		    		int temp = massiveArray[j];
		    		massiveArray[j] = massiveArray[i];
		    		massiveArray[i] = temp; 
		    	}
		    }
		    
		    */
		    for(int j = i + 1; j <massiveArray.length; j++)
		    {
		    	if(currentMin > massiveArray[j])
		    	{
		    		 currentMin = massiveArray[j];
		    		 currentMinIndex = j; 
		    	}
		    }
		    
		    if(currentMinIndex != i)
		    {
		    	massiveArray[currentMinIndex] = massiveArray[i];
		    	massiveArray[i] = currentMin; 
		    }
		    
		
		}
	}

}

class StopWatch{
	
	private long startTime;  
	private long endTime;
	
	StopWatch(){
		startTime = System.currentTimeMillis();
		endTime = startTime;
	}
	
	
	public void start() {
		startTime = System.currentTimeMillis();
	}
	
	public void stop() {
		endTime = System.currentTimeMillis();
	}
	
	public long getElapsedTime() {
		return endTime - startTime;
	}
	
	//getters for startTime and endTime
	public long getStartTime() {
		return startTime;
	}
	/**
	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}
	*/
	public long getEndTime() {
		return endTime;
	}
	/**
	public void setEndTime(long endTime) {
		this.endTime = endTime;
	} 
	*/
	
	
}