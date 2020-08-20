$('button').click(() =>{
    let numbers = document.getElementById('numbers').value.split(' ');
    const url = 'https://fathomless-bayou-96611.herokuapp.com/';
    $.ajax({
        url: url+ '/calculate',
        method: 'post',
        dataType: 'text',
        success: (response) =>{
            let data = JSON.parse(response.data);
            $('#mean').append("Mean: " + data.mean);
            $('#standard').append("Standard Deviation: " + data.standard);
        },
        error: (error) =>{
            console.log(error);
        }
    })

})