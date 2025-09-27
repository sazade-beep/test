console.log("hello")
age=30
while(age<38){
    age+=6
    
}
 console.log(age)

 let s=document.getElementById('box')
 console.log(s)

// function color(){
// s.style.backgroundColor = "red"
//}

function color(){

    if(s.style.backgroundColor=="black"){
    s.style.backgroundColor="red"
    }
    else if(s.style.backgroundColor=="red"){
    s.style.backgroundColor="blue"
    }
    else if(s.style.backgroundColor=="blue"){
        s.style.backgroundColor="yellow"
}
else{
    s.style.backgroundColor="black"
}

}
