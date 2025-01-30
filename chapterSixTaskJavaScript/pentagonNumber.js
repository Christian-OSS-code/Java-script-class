

//6.1
function pentagonNumber(x){

    return (3*x*x  - x)/2;
}

    
let n = 5;

console.log(pentagonNumber(n));


//6.2. Sum Of Digit In An Integer
function sumDigits(number){

   let remainder = 0;

    let sum = 0;

    let count = 0;

    while (number > 0){

        remainder = number%10;

        sum = remainder + sum;


        number = number/10;

        count ++;

    

    }
    return sum;

}

let value = 234

console.log(Math.trunc(sumDigits(value)));



//6.3a. Reversal Of Integer

function reversalOfInteger(number){

    let reversedNumber = parseInt(number.toString().split('').reverse().join(''));

    return reversedNumber;

}
let integer = 456
console.log(reversalOfInteger(integer));



//6.3b. Palindrome
function isPalindrome(number){

    let palindromeCheck = parseInt(number.toString().split("").reverse().join(""));

    if (parseInt(number) == palindromeCheck) return true;

    else return false;

}
let palindromeInteger = 121;

console.log(isPalindrome(palindromeInteger));



//6.4 Display reversed Integer

function IntegerInReversed(number){

    let reversedInteger = parseInt(number.toString().split("").reverse().join(""));

    return reversedInteger;

}
let digits = 3456
console.log(IntegerInReversed(digits));



//6.5 Sort Three Numbers

function sortedNumber(number1, number2, number3){

    let max = Math.max(number1, number2, number3);
    let min = Math.min(number1, number2, number3);

    if (number1 != max && number1 != min){

    
        return [min, number1, max];
    }
    else if (number2 != max && number2 != min){
        middleNumber = number2;

        return [min, number2, max];
    }
    else if (number3 != max && number3 != min){
        return [min, number3, max];
        
    }
}

let x = 12;

let y = 49;
 
let z = 11;

console.log(sortedNumber(x, y, z));



//6.7 Display Patterns
function financialApplication(investmentAmount, monthlyInterestRate, years){

   let first = 1 + monthlyInterestRate/1200;

   let second = Math.pow(first, year);

   let result = amount * second;

   return result;


}

let amount = 10000;

let interest = 5;

let year = 5;

console.log(financialApplication(amount, interest, year));



//6.8a Temperature Conversion

function celsiusToFahrenheit(celsius){
              

    return (5/9) * (celsius - 32);

}
let temperature = 270;
console.log(celsiusToFahrenheit(temperature));




//6.8b Temperature Conversion in Fahrenheit

function FahrenheitToCelsius(temperature){

    return ((9/5) * temperature) + 32;

}
let temperatureValue = 45;
console.log(FahrenheitToCelsius(temperatureValue));



//6.9a Conversion From Feet to Meter

function feetToMeter(foot){

    return 0.305 * foot

}
let valueInFeet = 10.0;

console.log(feetToMeter(valueInFeet)); 



//6.9b

function meterToFeet(meter){

    return meter/0.305;

}
let valueInMeter = 60.0;
console.log(meterToFeet(valueInMeter));



//6.10
function primeNumberFunction(number){

    let primeCount = 0;
    
    for (let count = 2; count < Math.sqrt(number); count ++){

        if (number%count != 0)  primeCount ++;

    
    }
    return primeCount; 


}
let primeCheck = 10000;
console.log(primeNumberFunction(primeCheck));


    
//6.13 Sum Number Series

function computeSeries(number){



    let sum = 0;

    for (let count = 1; count <= number; count ++){

         sum += (count)/(count + 1); 

    }
    return sum;


}
let numberSeries = 20;
console.log(computeSeries(numberSeries));



//6.14
function computePi(number){

    let sum = 0;

    for (let count = 1; count <= number; count ++){

        sum += 4 * (Math.pow(-1, count + 1)/(2 * count - 1));

    }
    return sum;


}
let numberPi = 901;
console.log(computePi(numberPi));



//6.16
function numberOfDaysInAYear(year1, year2){

    let numberOfDaysLeapYear = 0;

    let numberOfDays = 0;

    for (let count = year1; count <= year2; count ++){

        if (year % 4 == 0){


            numberOfDaysLeapYear  += 366;

        }
        else {

            numberOfDays += 365;
    
        }

    }
    return numberOfDaysLeapYear + numberOfDays;


}
let firstYear = 2010;

let secondYear = 2020;

console.log(numberOfDaysInAYear(firstYear, secondYear));



//6.17

function myTriangle(value1, value2, value3){

    if (value1 + value2 > value3 && value1 + value3 > value2 && value2 + value3 > value1) {

        let sides = (value1 + value2 + value3)/2;

        let evaluateSides = sides * (sides - value1) * (sides - value2) * (sides - value3);

        let area = Math.sqrt(evaluateSides);


        return true + "\nThe area of the triangle is " + area;

    }

    
        else return false + "\nInput is invaid!";

}
let side1 = 1;

let side2 = 3;

let side3 = 1;

console.log(myTriangle(side1, side2, side3));



//6.20 Geometry: Distance

function geometryDistanceBetweenTwoPoints(value1, value2, value3){

    return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));


}
let x1 = 4;
let x2 = 8;
let y1 = 4;
let y2 = 7;

console.log(geometryDistanceBetweenTwoPoints(x1, x2, y1, y2));


























































