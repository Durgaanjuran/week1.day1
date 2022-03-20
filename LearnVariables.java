package week1.day1;

public class LearnVariables {
	
	String mobileModel = "Samsung";
	
    float mobileWeight =300;
    
    Boolean isFullyCharged = true;
    
    int mobileCost = 20000;

	public static void main(String[] args) {
		
		LearnVariables myMobile = new LearnVariables();
		
		System.out.println(myMobile.mobileModel);
		System.out.println(myMobile.mobileWeight);
		System.out.println(myMobile.mobileCost);
		System.out.println(myMobile.isFullyCharged);
		
	}

}
