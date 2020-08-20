$('#buttonB').click(() =>{
    let numbers = document.getElementById('#numbers').value;
    const url = 'https://fathomless-bayou-96611.herokuapp.com/calculate';
    $.ajax({
        url: url,
        method: 'post',
        dataType: 'text',
        success: (response) =>{
            console.log("Hola")
            let data = JSON.parse(response.data);
            $('#mean').append("Mean: " + data.mean);
            $('#standard').append("Standard Deviation: " + data.std);
        },
        error: (error) =>{
            console.log(error);
        }
    })

})