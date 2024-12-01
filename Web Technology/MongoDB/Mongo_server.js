const express=require('express');
const mongoose=require('mongoose');
const Students = require("./Students.js");

//take body parser to add data with url
const bodyParser = require('body-parser');


//connection string for connecting database
const connectionString="mongodb+srv://23010101021:Bhalodiya%40123@cluster0.bsjmo.mongodb.net/CSE_161"

//conect mongoose
mongoose.connect(connectionString)
.then(()=>{
    console.log("Mongoose is connected");
    const app=express();

    //add data with url
    app.use(bodyParser.urlencoded());
    
    //get all the students data
    app.get('/students',async(req,res)=>{
        const ans=await Students.find();
        res.send(ans);
    });
    
    //add data with post method 
    app.post('/students',async(req,res)=>{
        // stu=new Students({
        //     id:req.body.id,
        //     name:req.body.name,
        //     email:req.body.email
        // });
        stu=new Students({ ...req.body});
        const ans=await stu.save();
        res.send(ans);
    });
    
    //delete data
    app.delete('/students/:id',async (req,res)=>{
        const ans=await Students.deleteOne({id:req.body.id});
        res.send(ans);
    });

    //edit data
    app.patch('/students/:id',async (req,res)=>{
        const stu=await Students.findOne({id:req.body.id});
        stu.name=req.body.name;
        const ans=await stu.save();
        res.send(ans);
    })
    
    const port=8000;
    app.listen(port,()=>{
        console.log(`Server is strated @ ${port}`);
    })
})
.catch((err)=>console.log(err));

