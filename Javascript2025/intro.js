
const myString = "45.9";
const myNumber = parseInt(myString);
console.log(myNumber);
console.log(parseInt("Xyz"));
console.log(isNaN("vinod"));
console.log("5" + 6);
console.log(5 === '5');
console.log(10 >= 10);


let num1 = 3;
let num2 = '3';
if (num1 === num2) {// === check data type
  console.log("equal");
  
} else {
  console.log("not equal");
  
}
// 1st student
var a = 9;
var b = 10;
var sum1 = a+b;
console.log(sum1);
//2nd student
var a= 9;
var b = 78;
var sum2 = a+b;
console.log(sum2);
// 3rd syudent
var a =9

b = 7;
var sum3 = a+b;
console.log(sum3);

// profit fuunction declartion let make a reusable code 
function sum(a, b) {
  return a+b;
}
console.log(" the sum of two number is " + sum(5,9));

