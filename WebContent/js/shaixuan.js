$('.clearDd').show();

var okSelect = []; //已经选择好的
var oSelectList = document.getElementById('selectList');

var oClearList = $(".hasBeenSelected .clearList");
var oCustext1 = document.getElementById('custext1');
var oCustext2 = document.getElementById('custext2');
var aItemTxt = oSelectList.getElementsByTagName('a');
var isCusPrice = false;//是否自定义价格
var radioVal = '';
var padioVal = '';
var hadioVal = '';
var tadioVal = '';

oSelectList.onclick = function(e,a) {
	
//	console.log(a);
    var ev = e || window.event;//实现浏览器兼容，获得事件
    var tag = ev.target || ev.srcElement;//实现浏览器兼容，获得事件源
    if(!tag)return;
    var tagName = tag.nodeName.toUpperCase();//标签名都变成大写
    var infor = '';
    var aRadio = document.getElementsByName('price');
    if( isCusPrice ) {//是否自定义价格
      radioVal = oCustext1.value + '-' + oCustext2.value + '元';//得到自定义的内容
    } else {
      radioVal = '';
    }
    padioVal = '';
    hadioVal = '';
    tadioVal = '';
    
    if (tagName == 'INPUT') {//标签名
//        if (tag.getAttribute('type').toUpperCase() == 'CHECKBOX') { //如果点击 的是 input checkbox
//            var val = next(tag);//属性名
//            if (tag.checked) {
//                var sType = prev(parents(tag, 'dd')).innerHTML;
//                val && okSelect.push(trim(val.innerHTML) + '|' + sType)
//            } else {
//                var sType = prev(parents(tag, 'dd')).innerHTML;
//                delStr(val.innerHTML + '|' + sType, okSelect)//得到内容
//            }
//        } else 
    	if (tag.getAttribute('type').toUpperCase() == 'BUTTON') { //如果点击的是 自定义价格按钮
            radioVal = oCustext1.value + '-' + oCustext2.value + '元';
            isCusPrice = true;

            for (var i = 0; i < aRadio.length; i++) {
                aRadio[i].checked = false;
            }

        }
    }
   
    for (var i = 0; i < aRadio.length; i++) {
        if (aRadio[i].checked) {
            radioVal = next(aRadio[i]).innerHTML;//得到具体的取值范围
            isCusPrice = false;
            break;
        }
    }
//    console.log("radio"+radioVal);
    if(a) {
         isCusPrice = false;
    }
    if(a == 3) {//选中价格的删除时触发
        for (var i = 0; i < aRadio.length; i++) {
            aRadio[i].checked = false;
        }           
    }
    else
    {
       if (radioVal) 
    	   infor += '<div class=\"selectedInfor selectedShow\"><span>租金&nbsp</span><label>' 
    		   + radioVal + '</label><em p="3"></em></div>';
    }
    
    
    
    //区域的选择
    var pRadio = document.getElementsByName('aera');
    for (var i = 0; i < pRadio.length; i++) {
        if (pRadio[i].checked) {
            padioVal = next(pRadio[i]).innerHTML;
            break;
        }
    }
    if(a == 2) {//选中价格的删除时触发
        for (var i = 0; i < pRadio.length; i++) {
            pRadio[i].checked = false;
        }           
    }
    else {
       if (padioVal) 
    	   infor += '<div class=\"selectedInfor selectedShow\"><span>区域&nbsp</span><label>' 
    		   + padioVal + '</label><em p="2"></em></div>';
    }
    //
    
//    console.log("padioVal"+padioVal);
    
    //房型的选择
    var hRadio = document.getElementsByName('hallNum');
    for (var i = 0; i < hRadio.length; i++) {
        if (hRadio[i].checked) {
            hadioVal = next(hRadio[i]).innerHTML;//得到具体的取值范围
            break;
        }
    }
    if(a == 4) {//选中价格的删除时触发
        for (var i = 0; i < hRadio.length; i++) {
            hRadio[i].checked = false;
        }           
    }
    else {
       if (hadioVal) 
    	   infor += '<div class=\"selectedInfor selectedShow\"><span>房型&nbsp</span><label>' 
    		   + hadioVal + '</label><em p="4"></em></div>';
    }
    //
//    console.log("hadioVal"+hadioVal);
    
    //类型的选择
    var tRadio = document.getElementsByName('type');
    for (var i = 0; i < tRadio.length; i++) {
        if (tRadio[i].checked) {
            tadioVal = next(tRadio[i]).innerHTML;//得到具体的取值范围
            break;
        }
    }
    if(a == 5) {//选中价格的删除时触发
        for (var i = 0; i < tRadio.length; i++) {
            tRadio[i].checked = false;
        }           
    }
    else {
       if (tadioVal) 
    	   infor += '<div class=\"selectedInfor selectedShow\"><span>类型&nbsp</span><label>' 
    		   + tadioVal + '</label><em p="5"></em></div>';
    }
    //
//    console.log("tadioVal"+tadioVal);

    
    
//    var vals = [];
//    for (var i = 0,size = okSelect.length; i < size; i++) {
//        vals = okSelect[i].split('|');
//        infor += '<div class=\"selectedInfor selectedShow\"><span>' + vals[1] + '</span><label>' + vals[0] + '</label><em></em></div>';
//    }
//    console.log(infor);
    oClearList.html(infor);//添加到指定位置
};




$('div.eliminateCriteria').click(function(){
    $(oSelectList).find('input').attr('checked',false);
    radioVal = '';
    padioVal = '';
    hadioVal = '';
    tadioVal = '';
    isCusPrice = false;
    okSelect.length = 0;
    $(oSelectList).trigger('click', 1);//tigger(触发的事件,传递给事件的参数)
})//点击全部清空，全部清空

$('.clearList').find('em').live('click',function(){
    var self = $(this);
//    console.log("self"+self);
    var val = self.prev().html() + '|' + self.prev().prev().html();
//    console.log("val"+val);
    var n = -1;
    var a = this.getAttribute('p') || 1;
//    console.log(a);
    self.die('click');
//    console.log(aItemTxt);
    for(var i = 0, len = aItemTxt.length; i < len; i++) {
         var html = val.split('|')[0];
         if(trim(aItemTxt[i].innerHTML) == html) {
              prev(aItemTxt[i]).checked = false;
              break;
        }
    };
    delStr(val, okSelect);//从okSelect删除val
    $(oSelectList).trigger('click', a);

})//点击图片会清空对应的记录

function delStr(str, arr) { //删除数组给定相同的字符串
    var n = -1;
    for (var i = 0,len = arr.length; i < len; i++) {
        if (str == arr[i]) {
            n = i;
            break;
        }
    }
    n > -1 && arr.splice(n, 1);
    //array.splice(index,howmany,item1,.....,itemX),index表示开始的地点(必需);howmany表示删除的个数(必需);
//    item添加的新成员,可选
};
function trim(str) {
    return str.replace(/^\s+|\s+$/g, '')
};
function text(e) {
    var t = '';
    e = e.childNodes || e;
    for (var j = 0; j < e.length; j++) {
        t += e[j].nodeType != 1 ? e[j].nodeValue: text(e[j].childNodes);
    }
    return trim(t);
}

function prev(elem) {
    do {
        elem = elem.previousSibling;
    } while ( elem && elem . nodeType != 1 );
    return elem;
};

function next(elem) {
//	nodeType 属性返回以数字值返回指定节点的节点类型。
//
//	如果节点是元素节点，则 nodeType 属性将返回 1。
//
//	如果节点是属性节点，则 nodeType 属性将返回 2。
	
    do {
        elem = elem.nextSibling;
    } while ( elem && elem . nodeType != 1 );
    return elem;
}

function parents(elem, parents) {  //查找当前祖先辈元素需要的节点  如 parents(oDiv, 'dd') 查找 oDiv 的祖先元素为dd 的
    if(!elem || !parents) return;
    var parents = parents.toUpperCase();
    do{
        elem = elem.parentNode;
    } while( elem.nodeName.toUpperCase() != parents );
    return elem;
};
