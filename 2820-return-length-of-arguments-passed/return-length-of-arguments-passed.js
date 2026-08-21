var argumentsLength = function(...args) {
    let length = 0; 
    for(arg of args){
        length++; 
    }
    return length; 
};

