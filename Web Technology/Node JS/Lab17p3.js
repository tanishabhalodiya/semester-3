const fs = require('fs');

// //file exits.....
fs.exists('abc.js',(data)=>{
    console.log("File exits: "+data);
});
fs.exists('hello.js',(data)=>{
    console.log("File exits: "+data);
});


// //statestics of file
fs.stat('hello.js',(err,data)=>{
    if(err){
        throw err
    }
    console.log(data);
});
fs.stat('abc.js',(err,data)=>{
    if(err){
        throw err
    }
    console.log(data);
});


// //open file....
fs.open('hello.js',(err)=>{
    if(err){
        throw err
    }
    console.log("File is opened")
})
fs.open('abc.js',(err)=>{
    if(err){
        throw err
    }
    console.log("File is opened")
})


// //close file......
fs.close(fd,(err)=>{
    if(err){
        throw err;
    }
    console.log("File is closed")
})


// //readfile.....
fs.readFile('hello2.js',(err,data)=>{
    if(err){
        throw err
    }
    console.log(data.toString())
})
console.log("OVER");


// //write in file
fs.writeFile('t.js',"tanisha",(err)=>{
    if(err){
       throw err
    }
});


// //write with append
fs.appendFile('t.js'," world",(err)=>{
    if(err){
        throw err
    }
});


// //delete file
fs.unlink('first.js',(err)=>{
    if(err){
        throw err
    }
    console.log("file is deleted")
})
fs.unlink('second.js',(err)=>{
    if(err){
        throw err
    }
    console.log("file is deleted")
})


// //rename the file.....
fs.rename('t.js','first.js',(err)=>{
    if(err){
        throw err;
    }
    console.log("file renamed successfully")
})

//copy file
fs.readFile('first.js',(err,data)=>{
    fs.writeFile('second.js',data.toString(),(err,data)=>{
        if(err){
            throw err
        }
        console.log("file is copied and paste succcessfully")
        
    });
});