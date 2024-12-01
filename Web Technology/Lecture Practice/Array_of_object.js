const express=require('express');
const bodyParser=require('body-parser');


const app=express();
app.use(bodyParser.urlencoded());

const students = [
    {
        id:1083,
        name:'devansh',
        email:'devansh@darshan.ac.in',
        age:26
    },
    {
        id:1291,
        name:'deep',
        email:'deep@darshan.ac.in',
        age:62
    }
];

//get all
app.get('/students',(req,res)=>{
    res.send(students);
});

//get by id
app.get('/students/:id',(req,res)=>{
    const ans=students.find(stu=>stu.id==req.params.id);
        res.send(ans);
    });
    
//create
app.post('/students',(req,res)=>{
    students.push(req.body);
    res.send("Added");
});

//to edit the perticular data
app.patch('/students/:id',(req,res)=>{
    const idToEdit=students.findIndex(stu=>stu.id==req.params.id);
    students[idToEdit]=req.params.id;
    res.send("Stuent is upadated")
})

//delete student method
app.delete('/students/:id',(req,res)=>{
    const idToEdit=students.findIndex(stu=>stu==req.params.id);
    students[idToEdit]=req.params.id;
    
    students.splice(idToEdit,1);
    res.send("Student deleted");
})

//search element with 
app.get('/students/search/:text',(req,res)=>{
    const ans=students.filter((stu)=>{
        if(stu.name.indexOf(req.params.text)>-1){
            return true;
        }
    })
    res.send(ans);
});

//search for students who contain specific characters 
app.get('/students/search/:text',(req,res)=>{
    const ans=students.filter((stu)=>{
        if(stu.name.indexOf(req.params.text)>-1 || stu.email.indexOf(req.params.text)>-1){
            return true;
        }
    });
    res.send(ans);
});

//filter between specified age
app.get('/students/:from/:to',(req,res)=>{
    //destructuring of variables to make access easy
    const {from,to}=req.params;
    const ans=students.filter(stu=>stu.age>from && stu.age<to);
    res.send(ans);
})

app.listen(3002,()=>{
    console.log("server is listen on @3002");
});
