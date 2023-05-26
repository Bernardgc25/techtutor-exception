public class TaxCalculator {
    public double calculateTax(String empName, boolean isIndian, double empSal) throws CountryNotValidException, TaxNotEligibleException, EmployeeNameInvalidException {
        double tempS;

        if(empName.isEmpty()){
            throw new EmployeeNameInvalidException();         
        }
        
        if(!isIndian){
            throw new CountryNotValidException(); 
        }

        if((isIndian) && (empSal >= 100000)){
            tempS = empSal * .80;
            return tempS / 10; 
        }
        else if((isIndian) && (empSal >= 50000 && empSal <= 99999)){
            tempS = empSal * .60;
            return tempS / 10; 
        }
        else if((isIndian) && (empSal >= 30000 && empSal <= 49999)){
            tempS = empSal * .50;
            return tempS / 10;  
        }
        else if((isIndian) && (empSal >= 10000 && empSal <= 39999)){
            tempS = empSal * .40;
            return tempS / 10; 
        }

        else{
            throw new TaxNotEligibleException(); 
     
        }

       
       
       
        
    }
}
