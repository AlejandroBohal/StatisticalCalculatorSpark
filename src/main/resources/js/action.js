console.log('hola');
$(document).on("click","#buttonB",() =>{
    let numbers = document.getElementById('numbers').value.toString();
    const url = 'https://fathomless-bayou-96611.herokuapp.com/calculate/';
    $.ajax({
        url: url,
        type:'POST',
        data: numbers,
        dataType: 'TEXT',
        success:function(response){
            let data = JSON.parse(response.data);
            $("#mean").append("Mean: " + data.mean);
            $("#std").append("Standard Deviation: " + data.std);
        },
        error: (error) =>{
            console.log(error);
        }
    });

})