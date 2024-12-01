for(i=0;i<5;i++){
    console.log("hello world");
}
//call another file function needs require
const c=require('./hello2');
c.display();

//path node
const path=require('path');

const data=path.join('/xyz','/abc');
console.log("Join : "+data);
console.log(path.relative("Relative: "+'/abc','/xyz'));
console.log(path.resolve("Resolve : "+'/abc','/xyz'));
console.log(path.dirname("directory : "+'/Lab6/Lab7p1.html'));
console.log(path.basename("BaseName: "+'/Lab6/Lab7p1.html'));
console.log(path.normalize("Normalize : "+'/abc','/xyz'));
console.log(path.extname("Extantion : "+'/Lab7p1.html'));