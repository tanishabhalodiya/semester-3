//[1] path core module..............
const path=require('path');

const data=path.join('/xyz','/abc');
console.log("Join : "+data);
console.log(path.relative("Relative: "+'/abc','/xyz'));
console.log(path.resolve("Resolve : "+'/abc','/xyz'));
console.log(path.dirname("directory : "+'/Lab6/Lab7p1.html'));
console.log(path.basename("BaseName: "+'/Lab6/Lab7p1.html'));
console.log(path.normalize("Normalize : "+'/abc','/xyz'));
console.log(path.extname("Extantion : "+'/Lab7p1.html'));

//[2] File System FS core module