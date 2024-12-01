const express=require('express');
const app=express();
const port=3001;

app.use(express.static('img'));
app.use('/photo',express.static('images'));

app.listen(port,(req,res)=>{
    console.log("Server is listening @ 3001");
});