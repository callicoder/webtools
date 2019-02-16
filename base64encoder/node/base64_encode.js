data = "Hello World !%$?"

enc = Buffer.from(data, 'utf-8').toString('base64');
console.log(enc)