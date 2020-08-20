$(document).on("click","#buttonB",() =>{
    let numbers = document.getElementById('numbers').value;
    const url = 'https://fathomless-bayou-96611.herokuapp.com/calculate';
    $.ajax({
        url: url,
        method: 'post',
        dataType: 'text',
        success: (response) =>{
            let data = JSON.parse(response.data);
            $("#mean").append("Mean: " + data.mean);
            $("#std").append("Standard Deviation: " + data.std);
        },
        error: (error) =>{
            console.log(error);
        }
    })

})