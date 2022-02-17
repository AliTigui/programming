let span = document.getElementsByTagName("span")[0];
let txt = document.getElementById("txt");
let checkNumber = document.getElementById("checkNumber");
let checkString = document.getElementById("checkString");
let checkSpecial = document.getElementById("checkSpecial");
let CheckEmail = document.getElementById("CheckEmail");
let CheckUsername = document.getElementById("CheckUsername");
let CheckTime = document.getElementById("CheckTime");
let CheckDate = document.getElementById("CheckDate");
let CheckAlphanumeric = document.getElementById("CheckAlphanumeric");
let CheckName = document.getElementById("CheckName");
let GetNumber = document.getElementById("GetNumber");
let GetString = document.getElementById("GetString");
let RemoveSpecial = document.getElementById("RemoveSpecial");
let InverseWord = document.getElementById("InverseWord");
checkNumber.onclick = ()=>{
    span.innerHTML = /^\d\d*\d$/.test(txt.value);
}
checkString.onclick = ()=>{
    span.innerHTML = /^[a-z][a-z]*[a-z]$/i.test(txt.value);
}
checkSpecial.onclick = ()=>{
   span.innerHTML = /[^(\w|\s)]+/.test(txt.value);
}
CheckEmail.onclick = ()=>{
    span.innerHTML = /^[a-z]+\w+@[a-z]\w+\.[a-z]+$/i.test(txt.value);
}
CheckUsername.onclick = ()=>{
    span.innerHTML = /^[a-z]+\w+$/i.test(txt.value);
}
CheckTime.onclick = ()=>{
    span.innerHTML =  /^[0-2]\d(\W)[0-5]\d\1[0-5]\d$/.test(txt.value);
}
CheckDate.onclick = ()=>{
    span.innerHTML = /^([0-2]\d|30)(\W)([0-9]|1[0-2])\2\d{4}$/.test(txt.value);
}
CheckAlphanumeric.onclick = ()=>{
    span.innerHTML = /\w{3,}/g.test(txt.value);
}
CheckName.onclick = ()=>{
    span.innerHTML = /^[a-z]{3,10}\s[a-z]{2,15}$/i.test(txt.value);
}
GetNumber.onclick = ()=>{
    span.innerHTML =  txt.value.match(/\d/g).join("");
}
GetString.onclick = ()=>{
    span.innerHTML = txt.value.match(/[a-z]/gi).join("");
}
RemoveSpecial.onclick = ()=>{
    span.innerHTML = txt.value.replace(/(\W|_)/g,"");
}
InverseWord.onclick = ()=>{
    span.innerHTML = txt.value.replace(/(\w+) (\w+) (\w+)/,"$3 $2 $1");
}













/*
variable declaration
# const for constant
# let it respect scope where we declare it can't be used
   in scop highter 
# var it always global scope
with var w can declare variable multiple time
but with le no we cant
var a = 4
var a = 5 // no error
let b = 4
let b = 6 //error
regex: look hand
*/