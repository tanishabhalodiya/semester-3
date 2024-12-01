const http=require('http');
const server=http.createServer();
server.listen(3002,()=>{
    console.log("server is in listen mode.");
})  