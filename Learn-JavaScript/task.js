// 1.   3 ways to print in javascript
// console.log("hello arshad")
// document.write(2 + 2);
// document.write('four plus five=', 4 + 5)
// alert("welcome to future");
// prompt("welcome to naya");
// alert("hi abdul")



// 2.  javascript console API
// console.log("thid id wrong ");
// console.warn("this is wrong");
// console.error("unavailable");
// console.clear();






// 3. javascript variables
// container to store data value

// s;
// document.write(s);
// var no1 = 24;
// var nor2 = 40;
// document.write("number one divide by", nor2 / no1);



//There is 3 types of variable in javascript
// i.var      
// It is function scope variable.



// ii). let,const
// It is block scope variable
// i.
// var name = "abdul"
// var Name = "Qadeer";
// console.log(name);

// ii.
// let name = "abdul";
// let name1 = "qadeer";
// console.log(name);

// // iii.
// const name = "ahamd"
// name = "naseem";
// console.log(name);

//2nd method
// i.
function me() {
    // var name = "abdul";
    // var surname = "ansari";
    // const name = "abdul";
    // const surname = "ansari";
    // let name = "abdul";
    // let surname = "ansari";
    if (true) {
        // var name = "qadeer";
        // var surname = "ansari";


        // let name = "hamid";
        // let surname = "ansari";

        // const name = "qadeer";
        // const surname = "ansari";
        // console.log("fullname = " + name + "" + surname);
    }
    // console.log("fullname = " + name + " " + surname);
}


me();


// 3rd method
// var whowillwintoday = "India";
// let whowillwintoday1 = "India";
// const whowillwintoday = "india";
if (true) {
    // var whowillwintoday = "india";
    // let whowillwintoday = "newzealand";

    // const whowillwintoday = "newzealand";
    // const whowillwintoday = "newzealand";
    // console.log(whowillwintoday);
    // console.log(whowillwintoday);
}
// console.log(whowillwintoday);
// console.log(whowillwintoday);
// console.log(whowillwintoday);
// console.log(whowillwintoday);
// console.log(whowillwintoday);
// console.log(whowillwintoday);



/*
// 4. Data types in javascript
1. primitive datatypes: Number, string, Boolean, null, undefined, Symbol
2. Reference datatypes: Array, objects
*/
//1.1 Numbers
var no1 = 24;
var nor2 = 40;
// document.write(no1 / nor2);

//1.2 string 
var str1 = "this is string";
var str2 = 'this is also a string'
    // console.log(str1);

var str = "I have done my mca have in 2020 batch 2020 2020";
// console.log(str.length);
// console.log(str.toUpperCase());
// console.log(str.replace("have", "has")); //it is only replace first string
// console.log(str.indexOf("2020"));
// console.log(str.lastIndexOf("2020"));
// console.log(str.slice(15, 30));        //its provide inbetween

//1.3 object:A javascript object is a collection of properties and values called object. In object we can store more
//than one value. In javascript every thing is an object expect primative data type beacause its hold single value.
var marks = {
        abdul: 50,
        hamid: 99,
        mohsin: 99.99


    }
    // console.log(marks);


//one object have object, array, function 

a = {
        id: 1,
        // name: "abdul",
        phone: 7038093885,
        email: "ansariabdulqadeer@853SpeechGrammarList.com",
        b: {
            car: "Volvo",
            medel: 2017,
            color: "blue",
            Fuel: "CNG"

        },

        aaaaaray: ["abdul", 45, null, undefined],

        mobile: function() {
            return model = "galexy";
        },

        me: function(name, surname) {
            // return this.name + "" + this.surname;
            // this.name1 = name;
            // this.surnam1 = surname;
            // console.log(`${name} ${surname}`)
        }


    }
    // console.log(a.mobile());
    // console.log(a.b.car);
    // console.log(a.mobile());
    // console.log(a.me("abdul", "ansari"));
    // console.log(a.aaaaaray);


// var defaults = {
//     backgroundcolor: '#000',
//     color: '#fff',
//     weekdays: ['sun', 'mon', 'tue', 'wed', 'thu', 'fri', 'sat']
// }

// console.log(defaults)
//1.4 Array
var array = [1, 2, 3, 4, 4, "abdul", 5, 6, 7];
// console.log([...new Set(array)]);
// console.log(array)

// console.log(typeof(array));
//1.5 undefined
//means we can not defined any value on it. if we have create variable and not assign value called undefined.

// var un
// var une
//     // console.log(une);
// console.log(un);


//1.6 null    null means we have create variable but we have manually defined null beacuse browser nerver say default null.
// var nul = null;
// var store = "";
// console.log(nul)
// console.log(store)




//5. Arithmatic operators

var a = 99;
var b = 20;

// console.log("the value of a+b=", a + b);
// // console.log(`the value of a+b= ${a+b}`);
// console.log("the value of a-b=", a - b);
// console.log("the value of a+b=", a * b);
// console.log("the value of a+b=", a / b);


//Assignment operators
// var c = b;
// c += 9;
// c *= 10;
// c /= 2;
// c -= 77;
// console.log(c);


// 6. comparison operators

// var x = 45;
// var y = 35;
// console.log(x == y);
// console.log(x <= y);
// console.log(x >= y);
// console.log(x < y);
// console.log(x > y);


// 7. Logical operator
//Logical and(if there is all true then its print true otherwise return false)
// console.log(true && true);
// console.log(true && false);
// console.log(false && true);
// console.log(false && false);

// logical or(if there is only one true then its print true otherwise return false)
// console.log(true || true);
// console.log(true || false);
// console.log(false || true);
// console.log(false || false);



//logical not

// console.log(!false);
// console.log(!true);



// 8. Function
// write one time logic and that logic multiple time called function

// function avg(a, b) {
//     // return (a + b) / 2; //main logic
//     c = (a + b) / 2;
//     return c;

// }

//DRY:do not repeat yourself
// c1 = avg(45, 77);
// c2 = avg(66, 99);
// c3 = avg(45, 88);
// c4 = avg(99, 88);

// console.log(c3, c2, c4, c1);
// console.log(c1);



//There is three types of function 
// here each function need to call
// 1. simple function
// 2. function with parameter
// 3.function by using return
// 1.

function addition() {
    var p = 30;
    var q = 20;
    // var add = p - q;
    // document.write(add);
}
//here we can call function we can call function any where outside 
// of function and multiple time as well.
addition();
// addition();
// addition();
// addition();



// 2. function with parameter

// function arithmaticoperation(x, y) {
//     var add1 = x + y;
//     // document.write("addition of two nos = " + add1 + "<br><br>");
//     console.log(`addition of two nos = ${add1}`)
// }
// arithmaticoperation(22, 55);
// arithmaticoperation(15, 20);
// arithmaticoperation(22, 50);
// arithmaticoperation(90, 21);


//3.function with using return

// var stored = hellogys(10, 10); //whenever we return any value we need to stored that value on call function
// // then we print it.
// document.write("multiplication of two nos = " + stored + "<br>")

// function hellogys(o, p) {
//     return q = o * p;
// }

//addition of two numbers
// function add() {
//     var no1 = parseInt(document.getElementById("t1").value);

//     var no2 = parseInt(document.getElementById("t2").value);
//     result1 = no1 + no2;
//     document.getElementById("result").innerHTML = "Result = " + result1;

// }




// 9. conditional operator

// if condition

// var age = 13;
if (age > 10) {
    // console.log("You are not a child");
}


//if else conditon

if (age > 13) {
    // console.log("you cannt drink rasna")
} else {
    // console.log("you can drink rasna")
}

//if else ladder

var age = 99;
if (age < 20) {
    // console.log("you canot married");
} else if (age >= 30) {
    // console.log("you have two children")

} else if (age >= 40) {
    // console.log("you have four children")
} else if (age >= 50) {
    // console.log("you have five children")
} else {
    // console.log("you are a grandfather")
}



// 10. Loops 
// 1.1 for loop 

var array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

// for (i = 0; i < array.length; i++) {
//     console.log(array[i]);
// }

// array.forEach(function(element) {
//     console.log(element);
// })

//print pattern in javascript

var m, n;
// 1.// for (m = 1; m <= 5; m++) {
//     for (n = 1; n <= m; n++) {
//         document.write("* &nbsp;&nbsp;");

//     }
//     document.write("<br>");
// }

// 2.
// for (m = 1; m <= 5; m++) {
//     for (n = 1; n <= m; n++) {
//         document.write(n + "&nbsp;&nbsp;");

//     }
//     document.write("<br>");
// }


// 3.
// for (m = 1; m <= 5; m++) {
//     for (n = 1; n <= m; n++) {
//         document.write(m + "&nbsp;&nbsp;");

//     }
//     document.write("<br>");
// }

// 4.
// var no = prompt("Please provide a number for the no of rows to be print in a pattern..."); //prompt() ye hame alert box provide krta hai
// for (var m = 1; m <= no; m++) {
//     for (var n = 1; n <= m; n++) {
//         document.write("0" + n + " ");
//     }
//     document.write("<br />");
// }



// 5.
// for (var m = 1; m <= 5; m++) {
//     for (var n = m; n <= 5; n++) {
//         document.write(n);
//     }
//     document.write("<br />");
// }



// let: this variable is describe to the scope if we can use function then there scope is on inside the function 
//const: in const variable we can't change there value

// 1.2 while loop 

// let j = 0;
// while (j < array.length) {
//     console.log(array[j]);
//     j++;
// }

// do {
//     // console.log(array[j]);
//     j++
// } while (j < array.length);


// 11. break and continue

var array = [1, 2, 3, 4, 5, 6, 7]
    // for (i = 0; i < array.length; i++) {
    //     if (i == 3) {
    //         break;
    //         // continue;
    //     }
    //     // console.log(array[i]);
    // }

// 12. Array methods 
arrlist = ["abdul", "majeed", "umer"]
// typeof(arrlist)
// console.log(typeof(arrlist))


// console.log(arrlist.length);
// console.log(arrlist[2]);
// console.log(arrlist.pop());
// arrlist.shift();
// arrlist.unshift('jameel');
// arrlist.sort();
// var cars = ["Saab", "Volvo", "BMW"];
// console.log(typeof(cars));
//print assending and descendin order 
var task = [5, 4, 14, 3, 2]
    // document.getElementById("demo").innerHTML = task;
    // console.log(cars.sort());
    // document.write(task);
    // document.write(cars.reverse());
    // function myFunction() {
    //     task.sort(function(a, b) { return a - b });
    //     document.write(task);
    // }

// console.log(Math.max(...task));
// task.sort(function(a, b) {
//     return b - a;

// })
// document.write(task);

//another task
// var task1 = ["a", "b", "c", "d", "e"]
// console.log(task1.slice(4));
// console.log(task1);
// console.log(arrlist);

// 13.string methods

var str = "I have done my mca have in 2020 batch 2020 2020";
// console.log(str.length);
// console.log(str.toUpperCase());
// console.log(str.replace("have", "has")); //it is only replace first string
// console.log(str.indexOf("2020"));
// console.log(str.lastIndexOf("2020"));
// console.log(str.slice(15, 30));        //its provide inbetween


// 14. Date methods
let mydate = new Date();
// console.log(mydate);
// document.write(mydate);
// console.log(mydate.getDay());
// console.log(mydate.getFullYear());
// console.log(mydate.getHours());
// console.log(mydate.getMilliseconds());
// console.log(mydate.getMinutes());

// 15. DOM manipulate

// 17. arrow function

// normal function

// function summ(a, b) {
//     return a + b;
// }


// arrow function

summ = (a, b) => {
        return a + b;

    }
    // console.log(summ(20, 30));
    // 18.  settimeout   and setInterval
    // 1.
    // timeout = () => { //It is a arrow function
    //     console.log("time out 3 seconds bad print hoga")
    // }
    // setTimeout(timeout, 3000); //here we set time to time out function
    // 2.
    // timeinterval = () => {
    //     console.log("ye har do second bd print krega");
    // }

// setInterval(timeinterval, 2000);
// agr ham is time interval ko rokna chate ho to use ek variable pass kar ke ye "clearInterval(clr)"

// eg
// agr ham is time interval ko rokna chate ho to use ek variable pass kar ke ye "clearInterval(clr)"

// clr = setInterval(timeinterval, 2000);
// console.log(clr);

// console me ja kr sirf type karna h "clearInterval(clr)"  for stop time interval



// JSON

// obj = { //ye ek object hai
//     name: "abdul",
//     div: "ten",

//     a: { //ye object ke andr object hai
//         car: "Volvo",
//         type: "four tier"
//     }
// }

// store = JSON.stringify(obj); //ye object ko string me convert karta hai
// console.log(store);
// console.log(typeof(store)); //ye hame btata h konse type ka data type h

parsed = JSON.parse('{ "name": "abdul", "div": "ten", "a": { "car": "Volvo", "type": "four tier" } }');
//json.parse string ko object me convert karta hai
// console.log(parsed);
// console.log(typeof(parsed));

//Backtiks or Template literals
var a = 10;
// console.log(`This is my ${a}`) //this is backticks or template literals
// console.log("this is my " + a)

// timeOut = () => {
//     console.log("ab ye 10 second bad print ho gya");
// }

// setTimeout(timeOut, 10000);
// console.log("plz wait 10 second we see the magic. ")

// timeInterval = () => {
//     console.log("ye hr 2 sonds pe ptint hota rhega");
// }
// setInterval(timeInterval, 2000);
// clr = setInterval(timeInterval, 2000);

// test = () => {

//         document.write("print after 2 seconds");
//         // document.write("<br/><br/><br/>");
//     }
//     // setTimeout(test, 5000);
// setInterval(test, 2000);
