const model = require('../model')

const maincontrollers= {};

maincontrollers.flowers = (req,res) =>{
    res.render('flowers',{users : model.users});
};
maincontrollers.trees = (req,res) =>{
    res.render('trees',{users : model.users});
};
maincontrollers.cars = (req,res) =>{
    res.render('cars',{users : model.users});
};
module.exports = maincontrollers;