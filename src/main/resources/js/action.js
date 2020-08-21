let btn = document.getElementById('buttonB');

btn.addEventListener('click',() =>{
    let numbers = document.getElementById('numbers').value;
    axios.post('http://fathomless-bayou-96611.herokuapp.com/calculate', numbers)
        .then(res => {
            let data = JSON.parse(res.data);
            $(".mean").append( "<span>Arithmetic mean: " + data.mean + "</span>");
            $(".std").append( "<span>Standard Deviation :" + data.std + "</span>");
        })
        .catch( error =>{
            console.log(error);
        })
});