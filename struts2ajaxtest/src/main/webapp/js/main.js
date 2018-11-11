// main.js
function ajax(){
    //ajax送信
    $.ajax({
        url : "/struts2ajaxtest/content/hello/ajax.action",
        type : "GET",
        dataType:"json",
        data : {data1:"hoge", data2:"piyo"},
        error : function(XMLHttpRequest, textStatus, errorThrown) {
            console.log("ajax通信に失敗しました");
        },
        success : function(response) {
            //alert("ajax通信に成功しました");
            //alert(response["a100"]);
            //console.log(response);
            $('#response').html(JSON.stringify(response).replace(/(https:[^\"]+)/g,"<a href=\"$1\">$1</a>"));
        }
    });
};
