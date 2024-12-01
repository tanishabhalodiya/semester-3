const child_process=require('child_process');
const { stdout } = require('process');


//child process for list of file
child_process.exec('dir',(err,stdout,stdin)=>{
    if(err){
        throw err
    }
    console.log(stdout)
})


//child process make directory
child_process.exec('mkdir directory',(err,stdout,stdin)=>{
    if(err){
        throw err;
    }
    console.log(stdout)
});


//access other language with child process
//first we complile java file one time
child_process.exec('javac hello.java',(err,stdout,stdin)=>{
    if(err){
        throw err;
    }
    console.log(stdout)
})
//after complie this file will run
child_process.exec('java hello',(err,stdout,stdin)=>{
    if(err){
        throw err;
    }
    console.log(stdout)
})

child_process.exec('hello.html',(err,stdout,stdin)=>{
    if(err){
        throw err;
    }
    console.log(stdout);
})

