    
import java.util.Scanner;
import java.util.InputMismatchException;



    public class CompoundInterestCalculator{

        private static final int PERCENTAGE = 100;
        


        public static void main(String... args){
    
            Scanner input = new Scanner(System.in);



            double principal = 0.0;
            boolean principalCheck = true;



            while (principalCheck){  

          
                try{
                    System.out.println("Enter your principal");
                    principal = input.nextDouble();

                    if (principal <= 0){

                        System.out.println("Zero and negative numbers not allowed here");
        
                        System.out.println();
    
                    }

                    

                    else break;
                 


                }
                catch (InputMismatchException e){
                    System.out.println("Invalid input!\nEnter only numbers greater than zero\n");

                    input.next();
                }




            }
            input.nextLine();



            double amount = 0.0;
            boolean amountCheck = true;




            while(amountCheck){


                try{

                    System.out.println("\n\nEnter your monthly contribution:\nEnter positive for deposits or negative for withdrawals");
                    amount = input.nextDouble();

                    if (amount < 0) System.out.println("amount cannot be zero");

                   
                        else break;
                }
                catch (InputMismatchException e){
                    System.out.println("Invalid input!\nEnter only numbers greater than zero\n");
                    input.next();

                }



            }
            input.nextLine();




            double year = 0.0;
            boolean yearCheck = true;





            while (yearCheck){
                

                try{
                    System.out.println("\n\nEnter the  length of time in year: ");
                    year = input.nextDouble();

                    if (year <= 0) System.out.print("year must be greater than zero");

                    else break;

                }
                catch (InputMismatchException e){
                    
                    System.out.println("Invalid input!\nEnter only numbers greater than zero\n");
                    input.next();

                }




            
            }
            input.nextLine();




            double estimatedInterestRate = 0.0;
            boolean estimatedInterestRateCheck = true;
            


            while (estimatedInterestRateCheck){
              
                try{  

                    System.out.println("\n\nEnter the anual interest rate between 0 and 100");
                    estimatedInterestRate = input.nextDouble();

                    if (estimatedInterestRate < 0 || estimatedInterestRate > 100) System.out.println("rate must be from 0 to 100");

                    else break;

                }
                catch (InputMismatchException e){

                    System.out.println("Invalid input!\nEnter only numbers greater than zero\n");
                    input.next();


                }




            }
            input.nextLine();



            int interestVarianceRange = 0;
            boolean interestVarianceRangeCheck = true;
            while (interestVarianceRangeCheck){
    
                try{
            

                    System.out.println("\n\nEnter the interest variance range: ");
                    interestVarianceRange = input.nextInt();

                    if (interestVarianceRange < 0) System.out.println("Enter a non negative integer");

                    else break;

                }
                catch (InputMismatchException e){
    
                    System.out.println("Invalid input!\nEnter only numbers greater than zero\n");
                    input.next();


                }
        

            }
            input.nextLine();



            int timeInterestCompounded = 0;
            boolean timeInterestCompoundedCheck = true;


            while (timeInterestCompoundedCheck){


                try{

                    System.out.println("\n\nEnter the time per year interest would be compounded");
                    timeInterestCompounded = input.nextInt();

                    if (timeInterestCompounded < 0) System.out.println("Enter a non negative integer");

                    else break;

                }
                    catch (InputMismatchException e){
        
                        System.out.println("Invalid input!\nEnter only numbers greater than zero\n");
                    input.next();

        
                }



            }
            input.nextLine();



            double lowerBoundInterestRate = estimatedInterestRate - interestVarianceRange;

        
            double upperBoundInterestRate = estimatedInterestRate + interestVarianceRange;

            

            double interestRate = estimatedInterestPerYear(estimatedInterestRate, timeInterestCompounded);


            double totalPeriodCalculated = calculatedTotalPeriod(year, timeInterestCompounded);



            double futureInvestment = growthInInvestment(principal, estimatedInterestRate, timeInterestCompounded,  amount, year);


            double compoundFrequencyFutureAmount = futureInvestmentWithinPeriodOfCompoundFrequency(principal, estimatedInterestRate, timeInterestCompounded,  amount, year);



            double lowerBoundaryInterest = estimatedInteresRateAtLowerBound(lowerBoundInterestRate, timeInterestCompounded);



            double upperBoundaryInterest = estimatedInterestRateAtUpperBound(upperBoundInterestRate, timeInterestCompounded);


            double initialFutureAmountForLowerBound = calculateFutureAmountAtLowerBoundInterest(principal, estimatedInterestRate, timeInterestCompounded,  amount, year, lowerBoundInterestRate);



            double lowerBoundCompoundAmount = calculateGrowthInFutureInvestmentAtLowerBoundInterest(principal, estimatedInterestRate, timeInterestCompounded, amount, year, lowerBoundInterestRate);



            double initialAmountAtUpperBound =
calculateAmountAtUpperBoundInterestcalculateFutureAmountAtUpperBoundInterest(principal, estimatedInterestRate, timeInterestCompounded,  amount, year, upperBoundInterestRate);



            double finalCompoundAmount = calculateCompoundAmountAtUpperBoundInterest(principal, estimatedInterestRate, timeInterestCompounded, amount, year, upperBoundInterestRate);


            System.out.println("\nVIEW YOUR INVESTMENT GROWTH!");


            for (int count = 0; count < 80; count ++){

                System.out.print("=");

            }
            System.out.println();



            System.out.printf("lower bound interest rate is %.4f%n", lowerBoundaryInterest);



            System.out.printf("interest rate is %.4f%n", interestRate);


            System.out.printf("upper bound interest is: %.4f%n", upperBoundaryInterest);

            System.out.println("Total period is " + totalPeriodCalculated);


            for (int count = 0; count < 80; count ++){

                System.out.print("=");

            }
            System.out.println();

            
            System.out.printf("Initial Amount for lower interest at %.2f %% is: # %.2f%n", lowerBoundInterestRate, initialFutureAmountForLowerBound);


             System.out.printf("Compound Amount for lower interest at %.2f %% is: # %.2f%n", lowerBoundInterestRate, lowerBoundCompoundAmount);


            for (int count = 0; count < 80; count ++){

                System.out.print("=");

            }
            System.out.println();



             System.out.printf("Initial Amount for estimated interest at %.2f %% is: # %.2f%n", estimatedInterestRate, futureInvestment);



            System.out.printf("Compound Amount for estimated interest at %.2f %% is: # %.2f%n", estimatedInterestRate, compoundFrequencyFutureAmount);


            for (int count = 0; count < 80; count ++){

                System.out.print("=");

            }
            System.out.println();



            System.out.printf("Initial Amount for upper bound interest at %.2f %% is: # %.2f%n", upperBoundInterestRate, initialAmountAtUpperBound);


            System.out.printf("Compound Amount for upper bound interest at %.2f %% is: # %.2f%n", upperBoundInterestRate, finalCompoundAmount);



            for (int count = 0; count < 80; count ++){

                System.out.print("=");

            }
            System.out.println();
            for (int count = 0; count < 80; count ++){

                System.out.print("=");

            }
            System.out.println();
            

    




        }   
        public static double estimatedInterestPerYear(double estimatedInterestRate, int timeInterestCompounded){

            double yearlyInterestEstimate = (estimatedInterestRate/PERCENTAGE)/(timeInterestCompounded);

            return yearlyInterestEstimate;





        }
        public static double calculatedTotalPeriod(double year, double timeInterestCompounded){
            double totalPeriod = year * timeInterestCompounded;

            return totalPeriod;





        }
        public static double growthInInvestment(double principal, double estimatedInterestRate, int timeInterestCompounded,  double amount, double year){



           double rate = estimatedInterestPerYear(estimatedInterestRate, timeInterestCompounded);


           double totalPeriodPerYear = calculatedTotalPeriod(year, timeInterestCompounded);


            double futureAmount = principal * Math.pow(1 + rate, totalPeriodPerYear);

            
            return futureAmount;

        }

        public static double futureInvestmentWithinPeriodOfCompoundFrequency(double principal, double estimatedInterestRate, int timeInterestCompounded,  double amount, double year){


            double calculatedInterestRate = estimatedInterestPerYear(estimatedInterestRate, timeInterestCompounded);


            double resolvedTotalPeriod = calculatedTotalPeriod(year, timeInterestCompounded);


            double compoundFutureAmount = growthInInvestment(principal, estimatedInterestRate, timeInterestCompounded,  amount, year);
        
            
            for (int count = 1; count <= resolvedTotalPeriod; count ++){

                  compoundFutureAmount += amount * Math.pow(1 + calculatedInterestRate, resolvedTotalPeriod - count);


            }
            return compoundFutureAmount;



        }
        public static double estimatedInteresRateAtLowerBound(double lowerBoundInterestRate, int timeInterestCompounded){

            double lowerBoundInterest = (lowerBoundInterestRate/PERCENTAGE)/(timeInterestCompounded);


            return lowerBoundInterest;


        }
        public static double estimatedInterestRateAtUpperBound(double upperBoundInterestRate, int timeInterestCompounded){


            double upperBoundInterest = (upperBoundInterestRate/PERCENTAGE)/(timeInterestCompounded);


            return upperBoundInterest;


        
        }


      public static double calculateFutureAmountAtLowerBoundInterest(double principal, double estimatedInterestRate, int timeInterestCompounded,  double amount, double year, double lowerBoundInterestRate){



            double InterestAtLowerBound = estimatedInteresRateAtLowerBound(lowerBoundInterestRate, timeInterestCompounded);



            double resolvedTotalPeriod = calculatedTotalPeriod(year, timeInterestCompounded);



            double initialFutureAmount = principal * Math.pow(1 + InterestAtLowerBound, resolvedTotalPeriod);

            return initialFutureAmount;
                            
                




        }
        public static double calculateGrowthInFutureInvestmentAtLowerBoundInterest(double principal, double estimatedInterestRate, int timeInterestCompounded,  double amount, double year, double lowerBoundInterestRate){


            double InterestAtLowerBound = estimatedInteresRateAtLowerBound(lowerBoundInterestRate, timeInterestCompounded);


            double resolvedTotalPeriod = calculatedTotalPeriod(year, timeInterestCompounded);


            double compoundFrequencyAmount =  calculateFutureAmountAtLowerBoundInterest(principal, estimatedInterestRate, timeInterestCompounded, amount, year, lowerBoundInterestRate);



            for (int count = 1; count <= resolvedTotalPeriod; count ++){

                compoundFrequencyAmount += amount * Math.pow(1 + InterestAtLowerBound, resolvedTotalPeriod - count);


            }
            return compoundFrequencyAmount;



        }
        public static double calculateAmountAtUpperBoundInterestcalculateFutureAmountAtUpperBoundInterest(double principal, double estimatedInterestRate, int timeInterestCompounded,  double amount, double year, double upperBoundInterestRate){



            double InterestAtUpperBound =  estimatedInterestRateAtUpperBound(upperBoundInterestRate, timeInterestCompounded);



            double resolvedTotalPeriod = calculatedTotalPeriod(year, timeInterestCompounded);



            double initialFutureAmountUpperBound = principal * Math.pow(1 + InterestAtUpperBound, resolvedTotalPeriod); 



            return initialFutureAmountUpperBound;            



        }
        public static double calculateCompoundAmountAtUpperBoundInterest(double principal, double estimatedInterestRate, int timeInterestCompounded,  double amount, double year, double upperBoundInterestRate){

    
            double InterestAtUpperBound =  estimatedInterestRateAtUpperBound(upperBoundInterestRate, timeInterestCompounded);



            double resolvedTotalPeriod = calculatedTotalPeriod(year, timeInterestCompounded);



            double compoundAmountAtUpperBound = calculateAmountAtUpperBoundInterestcalculateFutureAmountAtUpperBoundInterest(principal, estimatedInterestRate, timeInterestCompounded, amount, year, upperBoundInterestRate);

    
            for (int count = 1; count <= resolvedTotalPeriod; count ++){
        
                compoundAmountAtUpperBound += amount * Math.pow(1 + InterestAtUpperBound, resolvedTotalPeriod - count);


            }
            return compoundAmountAtUpperBound;
        

    
        }
        
        
           
     


    }







