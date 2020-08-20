let btn = document.getElementById('buttonB');

btn.addEventListener('click',() =>{
    let numbers = document.getElementById('numbers').value.toString();
    const url = 'https://fathomless-bayou-96611.herokuapp.com/calculate/';
    jQuery.ajax({
        url: url,
        type:'POST',
        data: numbers,
        dataType: 'TEXT',
        success:function(response){
            let data = JSON.parse(response.data);
            $("#mean").append("Mean: ");
            $("#std").append("Standard Deviation: ");
        }
    });
});