//1
person = {name: "John", age: 25, sex: "Male", complexion: "brown", "stateOfOrigin": "Benue", "country": "Nigeria"};


const car = {make: "Toyota", model:"Camry", year:2021};


//2
    for (const key in car){


        console.log(key + ":" + car[key]);

    }


//3

const laptop = {brand: "Dell", price: 1200};

laptop["colour"] = "blue"

console.log(laptop)

//4
laptop["brand"] = "apple"
laptop["price"] = 999 
console.log(laptop)

//5
person2 = {firstName: "John", lastName: "Stephen", fullName: function(){console.log("Full name is " + person2.firstName + ":" + person2.lastName)}}

person2.fullName();


//6
function personItems(person3){

    return "First Name" + ":" + person3["firstName"] + "Last Name" + ":" + person3["lastName"] + ":" + "Age" + ":" + person3["age"];

}    

const person3 = {firstName: "Gabriel", lastName: "Godwin", age: 38}

console.log(personItems(person3));

//7
bookObject = {title: "The Great Gatsby", author: "F. Scott Fitzgerald", yearPublished: 1925};

console.log(bookObject["title"] + " by " + bookObject["author"]);
//8

const profile = {name: "Sam", age: 40, profession: "Engineer"};

console.log("name" + " = " + profile["name"] + "\n" + "age" + " = " + profile["age"] + "\n" + "profession" + " = " + profile["profession"])










