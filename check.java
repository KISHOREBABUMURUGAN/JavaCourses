package capgeminibasicsjava;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class check {



	
	public static void main(String[] args) {
		
		
		
		// TODO Auto-generated method stub
		LocalDate currentDate = LocalDate.now(); 
        System.out.println("Current date: " + currentDate); 
  
        // Current time 
        LocalTime currentTime = LocalTime.now(); 
        System.out.println("Current time: " + currentTime); 
  
        // Current date and time 
        LocalDateTime currentDateTime = LocalDateTime.now(); 
        System.out.println("Current date and time: "
                           + currentDateTime); 
        
        DateTimeFormatter dt= DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(currentDate.format(dt));
        
        System.out.println(currentDate.now(ZoneId.of("US/Eastern")));
        System.out.println(currentTime.now(ZoneId.of("US/Eastern")));
       
      check ch=new check();
    System.out.println(  ch.getValue());
    System.out.println(  ch.getValue().containsValue("Ks"));
    		  
    List<String> a=List.of("k","l","m");
    Iterator<String>it=a.iterator();
    while(it.hasNext()) {
    	System.out.println(it.next());
    }
    
bank bh=new bank();
bh.chec();


	}
	
	public Map<String,String> getValue(){
	Map<String,String> a=new HashMap<>();
	a.put("1", "Ks");
	a.put("23", "Ks");
	a.put("1", "Ks");
		return a;
		
	}
	
	public class alap extends check {
		int a;

		public int getA() {
			return a;
		}

		public void setA(int a) {
			this.a = a;
		}
	
	}
	
	class bank extends alap{
		 
void chec() {
	setA(20);
}
		
	}

}
