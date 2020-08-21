let btn = document.getElementById('buttonB');

btn.addEventListener('click',() =>{
    let numbers = document.getElementById('numbers').value;
    axios.post('https://fathomless-bayou-96611.herokuapp.com/calculate', numbers)
        .then(res => {
            $('.mean').html('');
            $('.std').html('');
            let data = JSON.parse(res.data);
            $(".mean").append( "Arithmetic mean: " + data.mean );
            $(".std").append( "Standard Deviation :" + data.std);
        })
        .catch( error =>{
            console.log(error);
        })
});