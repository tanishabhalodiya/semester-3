student=['arjun','bala','gujarat','india'];

const express=require('express');
const app=express();
app.get('/home',(req,res)=>{
    res.send("home page");
});
// app.get('/student/0',(req,res)=>{
//     res.send(student[0])
// });
// app.get('/student/1',(req,res)=>{
//     res.send(student[1])
// });
// app.get('/student/2',(req,res)=>{
//     res.send(student[2])
// });
// app.get('/student/3',(req,res)=>{
//     res.send(student[3])
// });

//instead of doing this for all elemts of array, we can simply write.....
app.get('/student/:index',(req,res)=>{
    console.log("index: ",req.params);
    res.send(student[req.params.index]);
})
//get all students
app.get('/students',(req,res)=>{
    res.send(student);
})
app.listen(3000,()=>{
    console.log("server is listen on @3000");
});