package JQuery.����_20180213;

public class rolling_slider_banner {
	
	/*
	 * <!DOCTYPE html>
		<html lang="en">
		<head>
		    <meta charset="UTF-8">
		    <title>Document</title>
		    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
		    <script>
        		$(function(){
            		var list = $("#banner"); //<ul id="banner">�� list ������ ������Ų��.
		            var show_num = 3; //�����ӿ� ���� ����� ����
		            var num = 0; //����, ���� ��ư Ŭ���� �� �����Ǵ� ��
		            var total = $(">li",list).size(); //�� <li>�� ���� 5�� �����.
		            var li_width = $("li:first",list).width(); //<li>�� �ʺ� ���� ����
		            
		            //<li>�±� �� �ε��� ���� 3���� ���� <li>�±׸� �����Ѵ�. �׷��Ƿ� 0,1,2 �ε����� �ش��ϴ� <li>�±װ� �����Ǿ�
		            //<ul id="banner">�� �߰��Ѵ�.
		            var copyObj = $(">li:lt("+show_num+")",list).clone();
		            list.append(copyObj);
		            
		            //1. ���� ��ư�� Ŭ���� �� ���� �̺�Ʈ �ڵ鷯�� ����
		            $(".next").on("click", function(){
		                if(num == total){ //num���� 5�� ��� ���ǹ� ����
		                    num = 0;
		                    list.css("margin-left", num);
		                }
		                
		                num++; //num�� ���� 1�� ������Ų��.
		                list.stop().animate({marginLeft:-li_width*num+"px"}, 500);
		                return false;
		            });
		            
		            //2. ���� ��ư�� Ŭ���� �� ���� �̺�Ʈ �ڵ鷯�� ����
		            $(".prev").on("click", function(){
		                if(num == 0){ //num���� 0�� ��� ���ǹ� ����
		                    num = total;
		                    list.css("margin-left",-num*li_width+"px");
		                }
		                
		                num--; //num�� ���� 1�� ���ҽ�Ų��.
		                list.stop().animate({marginLeft:-li_width*num+"px"}, 500);
		                return false;
		            });
        		});
    		</script>
		    <style>
		        *{margin: 0; padding: 0;}
		        img{border: none; vertical-align: top;}
		        li{list-style: none; float: left; width: 80px;}
		        h1{text-align: center;}
		        #banner_wrap{width: 260px; padding: 10px 20px; margin: 0 auto; border: 1px solid #aaa;}
		        #banner{width: 5000px;}
		        #frame{width: 232px; height: 54px; overflow: hidden; position: relative; margin: 10px auto;}
		    </style>
		</head>
		<body>
		    <h1>�Ѹ� �����̵� ��� �����</h1>
		    <div id="banner_wrap">
		        <div id="frame">
		            <ul id="banner">
		                <li><a href="#"><img src="img/pic_t1.jpg" alt="����1" /></a></li>
		                <li><a href="#"><img src="img/pic_t2.jpg" alt="����2" /></a></li>
		                <li><a href="#"><img src="img/pic_t3.jpg" alt="����3" /></a></li>
		                <li><a href="#"><img src="img/pic_t4.jpg" alt="����4" /></a></li>
		                <li><a href="#"><img src="img/pic_t5.jpg" alt="����5" /></a></li>
		            </ul>
		        </div>
		        <p>
		            <a href="#" class="prev">
		                <img src="img/prev_btn.png" alt="���� ��ư" />
		            </a>
		            <a href="#" class="next">
		                <img src="img/next_btn.png" alt="���� ��ư" />
		            </a>
		        </p>
		    </div>
		</body>
		</html>
	 */

}
