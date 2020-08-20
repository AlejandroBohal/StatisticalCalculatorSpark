$(document).on("click","#buttonB",() =>{
    let numbers = document.getElementById('numbers').value.toString();
    const url = 'https://fathomless-bayou-96611.herokuapp.com/calculate';
    $.post({
        url: url,
        data: numbers,
        dataType: 'text',
        success: function (response){
            let data = JSON.parse(response.data);
            $("#mean").append("Mean: " + data.mean);
            $("#std").append("Standard Deviation: " + data.std);
        },
        error: (error) =>{
            console.log(error);
        }
    });

})