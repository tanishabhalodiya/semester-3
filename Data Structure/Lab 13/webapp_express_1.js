const express=require('express');
const app=express();

Server.listen(3000,(req,res)=>{
    res.send("server is listening on 3000")
})
app.get('/',(req,res)=>{
    res.send("Helo world");
});