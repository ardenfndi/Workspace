package LinkedBag;
public class TestLinkedBag {
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {
 
		 
		BagInterface<String> myBag = new LinkedBag<String>();  
		myBag.add("1");
		myBag.add("11");
		myBag.add("111"); 
		myBag.add("1111");	 
                myBag.add("11111");	 
             	myBag.display();
                System.out.println("-------------------");
                myBag.remove();
		((LinkedBag)myBag).display();
                System.out.println("-------------------");
                
                myBag.remove("111");
                myBag.display();
                System.out.println("-------------------");
                
                myBag.add("1");
               	((LinkedBag)myBag).display();
                System.out.println("-------------------");
                
                System.out.println("frequenco of 1 is: " + myBag.getFrequencyOf("1"));
                
                if (myBag.contains("1111")) {
                    System.out.println("my bag DOES contain 1111!");
                    
                }
                else
                    System.out.println("my bag does not contain 1111!");
		 
	}
		
		 
}
