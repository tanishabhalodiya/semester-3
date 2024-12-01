const express=require('express');
const app=express();

app.get('/',(req,res)=>{
    res.send("Hello world")
})
app.get('/home',(req,res)=>{
    res.send("Hello world from home");
});
app.get('/ho?me',(req,res)=>{
    res.send("Hello world from /ho?me ")
})
app.get('/ho+me',(req,res)=>{
    res.send("Helloo worls from /ho+me");
})
app.get('/ho*me',(req,res)=>{
    res.send("Helloo worls from /ho*me");
})
app.post('/about',(req,res)=>{
    res.send("Home with post method");
})
app.all('/home',(req,res)=>{
    res.send("This response is for all");
})
app.listen(3000,()=>{
    console.log("server is listen on @3000");
});