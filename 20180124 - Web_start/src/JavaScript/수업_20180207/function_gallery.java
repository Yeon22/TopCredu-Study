package JavaScript.����_20180207;

public class function_gallery {
	
	/*
	 * <!DOCTYPE html>
		<html lang="en">
		<head>
		    <meta charset="UTF-8">
		    <title>���� ������</title>
		    <style>
		        * {margin: 0; padding: 0;}
		        li {list-style: none;}
		        a {text-decoration-style: none; color: #000;}
		        #gallery {width: 350px; margin: 30px auto; border: 1px solid #999; box-shadow: 0 5px 5px rgba(0,0,0,0.3);}
		        #gallery h1 {text-align: center;}
		        #gallery img {border: 1px solid #666;}
		        #photo {text-align: center;}
		        #gallery ul {width: 800px; margin: 0 auto; overflow: hidden;}
		        #photo_list ul li {width: 100px; float: left; text-align: center;}
		        #photo_list {width: 300px; margin: 10px auto; overflow: hidden;}
		        .btn_wrap {text-align: center;}
		        .btn_wrap a {font-weight: bold;}
		    </style>
		    
		    <script>
		        //window��ü, body�� ������ �� onload�Լ��� �ڵ����� �����ϱ� ������ body���� script���� �ۼ��ص� �ȴ�.
		        window.onload = function(){
		            //Ŭ�� �̺�Ʈ�� ����ϱ� ���ؼ� ���� ��Ͽ� 8���� <a>�� ��� �����Ѵ�.
		            var list_zone = document.getElementById("inner_list");
		            var list_a = list_zone.getElementsByTagName("a");
		            
		            //���丮��Ʈ�� ��� <a>�� Ŭ�� �̺�Ʈ�� ����ϱ� ���ؼ� �ݺ����� �̿��Ͽ� 8���� <a>�� ��� �̺�Ʈ�� ���
		            for(var i=0; i<list_a.length; i++){
		                list_a[i].onclick = function(){
		                    var ph = document.getElementById("photo").children[0];
		                    ph.src = this.href;
		                    return false; //<a>�� Ŭ������ �� ��ũ�� ���� �ʵ��� �Ѵ�.
		                }
		            }
		            
		            //����, ���� ��ư�� Ŭ���� ������ <ul>�� 100px��ŭ ���� �Ǵ� ���ҵǾ� ����, ���������� �̵��ȴ�.
		            
		            //���� ��ư�� Ŭ���� ������ <ul>�� 100px��ŭ �������� �̵��ؾ� �Ѵ�.
		            var b_btn = document.getElementById("next_btn");
		            var m_num = 0;
		            b_btn.onclick = function(){
		                if(m_num>=list_a.length-3) return false;
		                m_num++;
		                list_zone.style.marginLeft = -100*m_num+"px";
		                return false;
		            }
		            
		            //���� ��ư�� Ŭ���� ������ <ul>�� 100px��ŭ ���������� �̵��ؾ� �Ѵ�.
		            var n_btn = document.getElementById("before_btn");
		            n_btn.onclick = function(){
		                if(m_num<=0) return false;
		                m_num--;
		                list_zone.style.marginLeft = -100*m_num+"px";
		                return false;
		            }
		            
		        }
		    </script>
		</head>
		<body>
		    <div id="gallery">
		        <h1>���ؾ� ������</h1>
		        <p id="photo">
		            <img src="img/pic_1.jpg" width="320" alt="" />
		        </p>
		        <div id="photo_list">
		            <ul id="inner_list">
		                <li>
		                    <a href="img/pic_1.jpg">
		                        <img src="img/pic_t1.jpg" alt="����1" />
		                    </a>
		                </li>
		                <li>
		                    <a href="img/pic_2.jpg">
		                        <img src="img/pic_t2.jpg" alt="����2" />
		                    </a>
		                </li>
		                <li>
		                    <a href="img/pic_3.jpg">
		                        <img src="img/pic_t3.jpg" alt="����3" />
		                    </a>
		                </li>
		                <li>
		                    <a href="img/pic_4.jpg">
		                        <img src="img/pic_t4.jpg" alt="����4" />
		                    </a>
		                </li>
		                <li>
		                    <a href="img/pic_5.jpg">
		                        <img src="img/pic_t5.jpg" alt="����5" />
		                    </a>
		                </li>
		                <li>
		                    <a href="img/pic_6.jpg">
		                        <img src="img/pic_t6.jpg" alt="����6" />
		                    </a>
		                </li>
		                <li>
		                    <a href="img/pic_7.jpg">
		                        <img src="img/pic_t7.jpg" alt="����7" />
		                    </a>
		                </li>
		                <li>
		                    <a href="img/pic_8.jpg">
		                        <img src="img/pic_t8.jpg" alt="����8" />
		                    </a>
		                </li>
		            </ul>
		        </div>
		        <p class="btn_wrap">
		            <a href="#" id="before_btn">&lt;</a>
		            <a href="#" id="next_btn">&gt;</a>
		        </p>
		    </div>
		</body>
		</html>
	 */

}
