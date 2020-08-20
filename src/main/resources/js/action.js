$('button').click(() =>{
    let numbers = document.getElementById('numbers').value.split(' ');
    const url = 'https://fathomless-bayou-96611.herokuapp.com/';
    $.ajax({
        url: url+ 'calculate',
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