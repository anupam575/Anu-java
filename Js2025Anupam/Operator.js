// 5 + 20= 5 = operand + = operator 20 = operand

//this is an assign operator =
var x = 8;
var y = 8;
//console.log("Is both the x and y are equal or not :" +  x == y);
console.log(`Is both the x and Y are equal or not : ${x == y}`);


// this is an arithmetic operator 
console.log(3+3);
console.log(3-8);
console.log(20/5);
console.log(5*9);
console.log("Remainder Operator " + 80%8);
// this is an increment and decrement operator
//var  num = 15;
//var newNum = num++ + 5;// post increment
//console.log(num);
//console.log(newNum);

//console.log(num++);
var num = 15; 
var newNum = num-- + 5; // pre increment
console.log(num); 
console.log(newNum);
//this is an comparison operator
var a = 20;
var b = 30;
console.log(a != b);
console.log(a > b && b > -50 && b < 0);
// string concatenation
var myVeer = "vinod";
console.log("hello " + " world ");
console.log(myVeer + " bahadir ");
console.log(5**2);
console.log(10 ** -1);
console.log(5 + "veer");
var a = 5;
var b = 10;
var c = b;
b=a;
a=c;
console.log(" the value of a is : " + a);
console.log(" the value of b " + b);
a = a + b; //15
b = a - b; // 5
a = a - b;// 10

console.log("the value of a is :" + a);
console.log("the value of a is :" + b);

var num4 = 30;
var num5 = '30';// 30
console.log(num4 == num5);
console.log(num4 === num5);
console.log(typeof(num4));
console.log(typeof(num5));
console.log(num5);
// === or == difference
// == only check the value
// === check the value and datatype
/*
var tomar = 'rainy';
if (tomar == 'rainy') {
  console.log("take an umbrella");
  
} else {
  console.log("No need to take an umbrella");
  
  
}
  */
 var age = 18;
 if(age >  18) {
  console.log("You are eligible to vote");
  

 }else {
  console.log("you are not eligible to vote");
  
 }
 var gae = 17;
 console.log((gae > 18) ? " you ar eligible to vote" : "you are not eligible to vote");
 
// find the area of a circle and triangle

























