//router middle
const express=require('express');
const app=express();
//import the file
const studentRouter=require('./Student_routers');
const port=3000;

//link the file
app.use('/students',studentRouter);
app.listen(port,(req,res)=>{
    console.log("Server is listening @ 3000");
});
