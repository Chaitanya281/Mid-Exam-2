require('dotenv').config();
const express = require('express');
const bodyParser = require('body-parser');

const app = express();
const port = process.env.PORT || 3000;
const maincontrollers = require('./controllers/maincontroller');

app.use(express.json());
app.set('view engine','ejs'); 

app.get('/',maincontrollers.flowers);
app.get('/p1',maincontrollers.trees);
app.get('/p2',maincontrollers.cars);


app.listen(port, () => {
    console.log(`Server is running on port http://localhost:${port}`);
});

