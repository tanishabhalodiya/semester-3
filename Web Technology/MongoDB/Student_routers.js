const express=require('express');
const router=express();
module.exports=router;
router.get('/stu1',(req,res)=>{
    res.send("Hello from student 1")
});
router.get('/stu2',(req,res)=>{
    res.send("Hello from student 2")
});
router.get('/fac1',(req,res)=>{
    res.send("Hello from faculty 1")
});
router.get('/fac1',(req,res)=>{
    res.send("Hello from faculty 1")
});