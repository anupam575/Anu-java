
//Function definition = befor we use a function we have to define it
//alse called function declaration or function statement c
//the name of the funcytion a list of a parametre to the function enclosed in a parenthesis a nd separted by commas 
/*
function sum() {
  var a = 7, b = 9;
  var total = a + b;{function definition}
  console.log(total);
  
}
sum();
sum(); functin call
*/
//function paramtere vs function arguments
/*
function sum(a,b) { //function parametre aa value pass 20 b value pass 30
  var total = a+b;
  console.log(total);
  
}
sum();// no arguments
sum(20,30);// different arguments
sum(34,56); //function argumnets
//you can reuse code define the code once and use it many times 
// you can use the same code many times with different arguents to produce different results(dry)
// next topic function expression return keyword
function sum(a,b) {
  return a+b;

}
var funExp = sum(20,56);
console.log("the value of two value is  is:" +  funExp);


// difference between let const var
const myName = " vinod thatpa";// const variable doe not change
//var => function scope
//Let => block scope
console.log(myName);
myName = "tripathi";
console.log(myName);

function biodata() {
  var myFirstName = "vinod";// parent 
  console.log(myFirstName);
  if(true){
    var myLastName = "tripathi";
    console.log('inner' + myFirstName);//child
    console.log('inner' + myLastName );
    
    
  }
  console.log('inner outer' + myLastName);
  
  
}
biodata();
// let and const = block scope {}
//var = function scope complete scope {}

//Template literals

for (let num = 1; num <=10; num++){
  let tableOf = 123456789;
  console.log(`${tableOf} * ${num} = ${tableOf * num}`);
  
}
  
 // default parametre function
 function mul(a,b = 8) {
  return a*b;
 }
 console.log(mul(5));
 
let sum = () => {
  //let a= 8; b =9;
  //let total = a+b;
  return `the sum of two number is ${(a=5)+(b=9)}`
}
console.log(sum()); 
// array multiple value store 1 variable
var myFriends = ['vinod', 'tripthi', 'kumar', 22, true];
console.log(myFriends);
// this is a traversal array
var myFriends2 = ['a', 'b', 'c', 'd', 'e'];
console.log(myFriends2[1]);
console.log(myFriends2.length-1);
for (i=0; i<myFriends2.length; i++) {
  console.log(myFriends2[i]);
  for(let element in myFriends2) {
    console.log(myFriends2[i]);
    
  }
  
}

*/
   // var myFriends = ['A', 'b', 'c', 'd', 'e', 'f'];
    //myFriends.forEach(function (element, index, array) {
     // console.log(element + " index : " + index + " " + array );
      
   // });
   //myFriends.forEach((element, index ,array) => {
    //console.log(element + "index :" + index + " " + array);
    //console.log( index );
    //console.log(element);
    //console.log(array);
    
    

    
   //});

   
