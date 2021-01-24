
function addSurrey() {

  var obj = {
  moreInfo:$('#input_5').val(),
  question1:getRadioVal('q4_overallSatisfaction[0]' ),
  question2:getRadioVal('q4_overallSatisfaction[1]' ),
  question3:getRadioVal('q4_overallSatisfaction[2]' ),
  question4:getRadioVal('q4_overallSatisfaction[3]' ),
  question5:getRadioVal('q4_overallSatisfaction[4]' ),
  question6:getRadioVal('q4_overallSatisfaction[5]' ),
  question7:getRadioVal('q4_overallSatisfaction[6]' ),
  question8:getRadioVal('q4_overallSatisfaction[7]' ),
  question9:getRadioVal('q4_overallSatisfaction[8]' )

    };
    $.ajax({
            type: "POST",
            contentType: "application/json",
            url: "/api/v1/surrey",
            data: JSON.stringify(obj),
            dataType: 'json'
        });
}

function getRadioVal(name) {
    var val=null;
    var radios = document.getElementsByName(name);
    if(radios.length=0){
    return val
    }
    for (var i=0, len=radios.length; i<len; i++) {
        if ( radios[i].checked ) {
            val = radios[i].value;
            break;
        }
    }
    return val;
}
