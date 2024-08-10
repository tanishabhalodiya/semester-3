const express=require('express');
const fs=require('fs');
const bodyParser=require('body-parser');
const users=require('./MOCK_DATA.json');
const app=express();
app.use(bodyParser.urlencoded({extended:false}))

//get data in jason file
app.get('/api/users',(req,res)=>{
    return res.json(users);
});

//get data in html rendering
app.get('/users',(req,res)=>{
    const html=`<ul>
                    ${users.map(users=>`<li>${users.first_name}</li>`).join("")};
                </ul>`;
    res.send(html);
});

//add users
app.post('/api/users',(req,res)=>{
    const body = req.body;
    users.push({...body,id:users.length+1});
    // users.push(req.params.first_name)
    fs.writeFile("MOCK_DATA.json",JSON.stringify(users),(err,data)=>{
    });
    res.send("student added");
});
app.listen(3000,()=>{
    console.log("Server is listenng @3000");
})