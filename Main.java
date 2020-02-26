package epam5;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

public class Main {
	  private static Logger LOGGER = LogManager.getLogger(Main.class);
	public static void main(String[] args) throws Exception  {

		  Scanner scanner = new Scanner(System.in);
		  LOGGER.error("Enter:\n1 for normal standard materials \n2 for above normal standard materials\n3 for high standard materials");
		  int material_standard=scanner.nextInt();
		  LOGGER.error("Enter:\n0 for not a automated house\n1 for fully automated house");
		  int automatic =scanner.nextInt();
		  LOGGER.error("Total area of house");
		  double area=scanner.nextDouble();
		  CostEstimation costestimation= new CostEstimation();
		  LOGGER.error(costestimation.calculateEstimate(area,material_standard,automatic));
		  
		  LOGGER.error("Enter principle amount, rate, time for calculating interest:");
	      double principle_amount=scanner.nextDouble();
	      double rate=scanner.nextDouble();
	      double time=scanner.nextDouble();
	     
		  Interest interest=new Interest();
		  LOGGER.error("Simple Interest="+interest.simpleInterest(rate,principle_amount,time));
		  LOGGER.error("Compound Interest="+interest.compoundInterest(principle_amount,rate,time));
	      scanner.close();
	 }


}
