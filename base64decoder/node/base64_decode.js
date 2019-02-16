encodedData = "SGVsbG8gV29ybGQgISUkPw=="

decodedData = Buffer.from(encodedData, 'base64').toString('utf-8');
console.log(decodedData)