function ew(obj,index){
    //  alert("-----"+obj.page);
    var htmls="<ul class='pagination'>";
    htmls +="<li  class='"+(obj.page=== 1?"disabled" : "")+"'><a onclick='show("+(obj.page-1)+")'>&laquo;</a></li>";
    var pageTotal=obj.row>=6?obj.row:7;
    if(obj.page < 6){
        for (var i = 1; i <= pageTotal ; i++) {
            htmls +="<li  class='"+(obj.page===i?"disabled" : "")+"'><a name='page'  id='page'  onclick='show("+i+")' value='"+i+"'>"+i+"</a></li>";
        }
    }else {
        for (var i = 1; i <= pageTotal; i++) {
            if(i<3){
                htmls +="<li class='"+(obj.page===i?"disabled" : "")+"'><a  name='page' id='page'  onclick='show("+i+")' value="+i+"'>"+i+"</a></li>";
            }
            if(i === 3){
                htmls +="<li ><a class='disabled'>....</a></li>";
            }
            if(obj.page >3){
                if(i===4){
                    if(obj.page  === obj.total){
                        htmls +="<li><a onclick='show("+i+")' value="+i+"'>"+i+"</a></li>";
                    }
                    htmls +="<li><a onclick='show("+(obj.page-1)+")' value="+i+"'>"+(obj.page-1)+"</a></li>";
                }
                if(i===5){
                    htmls +="<li><a onclick='show("+(obj.page)+")'>"+obj.page+"</a></li>";
                }
                if(i=== 6 && obj.page<obj.total){
                    htmls +="<li><a onclick='show("+(obj.page+1)+")'>"+(obj.page+1)+"</a></li>";
                }
                if(i=== 7 && obj.page<(obj.total-1)){
                    htmls +="<li><a class='disabled'>.....</a></li>";
                }

            }

        }
    }
    htmls +="<li class='"+(obj.page===obj.getMaxPage?"disabled" : "")+"'><a onclick='show("+(obj.page+1)+")'  >&raquo;</a></li> </ul>";
    // alert("#"+index)
    $("#"+index).html(htmls);
}