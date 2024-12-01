const http = require("http");

const server = http.createServer((req, res) => {
  res.setHeader("Content-Type", "text/plain");
  res.end("hello world");
  if (req.url === "/favicon/url") {
    res.end("This is the favicon");
  }
});

server.listen(2006, () => {
  console.log("Server is listening on port 3000");
});
