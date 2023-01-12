let arr=[];
function validate(){
    var x = document.getElementById("pass1").value;
    var y = document.getElementById("pass2").value;
    
    var userID = document.getElementById("Myform").value;
    var usrename = document.getElementById("name1").value;
    var dob = document.getElementById("dob1").value;
    var add = document.getElementById("address1").value;
    var ed = document.getElementById("ed1").value;
    arr.push(userID);
    arr.push(usrename);
    arr.push(dob);
    arr.push(add);
    arr.push(ed);
    var Print = "user Id :"+arr[0]+"<br>"+"user Name: "+arr[1]+"<br>"+"DOB: "+arr[2]+"<br>"+"Address: "+arr[3];
    localStorage.setItem("Print",Print);
    
    
    if(x != y){
        alert("Password doesn't matched");
        return false
    }
    else{
        return true 
    }
}
function generateUserId() {
    var userId = (Math.pow(10,8));
    var userid=Math.trunc(parseInt(userId)*Math.random());
    document.getElementById("Myform").value =userid;
  }
  window.onload = generateUserId;